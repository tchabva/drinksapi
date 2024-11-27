package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Soda;
import com.northcoders.drinksapi.service.SodaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SodaController {

    @Autowired
    SodaService sodaService;

    @GetMapping("/sodalover")
    public ResponseEntity<String> sodaLover(){
        return new ResponseEntity<>("I like Soda!", HttpStatus.OK);
    }

    @GetMapping("/soda")
    public ResponseEntity<Soda> soda(@RequestParam(value = "name", defaultValue = "coke") String name){
        return new ResponseEntity<>(sodaService.newSoda(name), HttpStatus.OK);
    }
}
