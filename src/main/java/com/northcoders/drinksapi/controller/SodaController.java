package com.northcoders.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SodaController {

    @GetMapping("/sodalover")
    public String sodaLover(){
        return "I like Soda!";
    }
}
