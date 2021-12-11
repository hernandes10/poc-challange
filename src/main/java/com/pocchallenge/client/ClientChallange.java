package com.pocchallenge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "ClientChallange", url = "http://challenge.dienekes.com.br", path = "/api/numbers")
public interface ClientChallange {
    @GetMapping("/")
    String getNumbers(@RequestParam(name = "page") Integer page);

}
