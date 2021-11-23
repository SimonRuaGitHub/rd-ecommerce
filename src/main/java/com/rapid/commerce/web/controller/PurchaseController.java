package com.rapid.commerce.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    @GetMapping(value = "/dummy", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity getDummyResponse(){
           return ResponseEntity.status(HttpStatus.OK).body("Hello There");
    }
}
