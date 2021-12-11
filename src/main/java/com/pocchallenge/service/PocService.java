package com.pocchallenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pocchallenge.client.ClientChallange;
import com.pocchallenge.models.Numbers;
import com.pocchallenge.models.Valor;
import com.pocchallenge.repositories.ValorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class PocService {
    @Autowired
    ClientChallange clientChallange;
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private ValorRepository valorRepository;

    public void initialLoad() throws JsonProcessingException {
        List<String> listAll = new ArrayList<>();
        int i = 1;
        while (i <= 1){
            try {
                String json =  clientChallange.getNumbers(i);

                Numbers n = objectMapper.readValue(json, Numbers.class);
                for (int j = 0; j < n.getNumbers().length; j++) {
                    Double[] arr = n.getNumbers();
                    Valor valor = new Valor(arr[j]);
                    System.err.println("INSERT INTO VALOR(id,number) values("+j+","+valor.getNumber()+");");
                  valorRepository.save(valor);
                }
                System.out.println("SUCCESS"+i);
                i++;
            }catch (Exception e){
                System.err.println("ERROR page ==> "+i);
            }

        }

    }
}
