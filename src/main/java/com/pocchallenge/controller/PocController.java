package com.pocchallenge.controller;

import com.pocchallenge.client.ClientChallange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PocController {

    @Autowired
    ClientChallange clientChallange;

    @GetMapping("/{page}")
    public String getList(@PathVariable Integer page) {

        return clientChallange.getNumbers(page);
    }
}
