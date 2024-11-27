package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Soda;
import com.northcoders.drinksapi.service.SodaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SodaController {

    @Autowired
    SodaService sodaService;

    @GetMapping("/sodalover")
    public String sodaLover(){
        return "I like Soda!";
    }

    @GetMapping("/soda")
    public Soda soda(@RequestParam(value = "name", defaultValue = "coke") String name){
        return sodaService.newSoda(name);
    }
}
