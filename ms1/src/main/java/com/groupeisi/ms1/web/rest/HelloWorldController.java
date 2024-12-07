package com.groupeisi.ms1.web.rest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/v1/helloworld")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Je suis ms1");
    }
}
