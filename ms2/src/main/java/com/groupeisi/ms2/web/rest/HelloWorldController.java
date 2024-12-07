package com.groupeisi.ms2.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/v1/helloworld")
    public String helloWorld(){
        return "Je suis ms2";
    }
}
