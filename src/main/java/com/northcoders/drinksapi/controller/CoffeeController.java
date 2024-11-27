package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import com.northcoders.drinksapi.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @GetMapping("/coffeelover")
    public String coffeeLover(){
        return "I like Coffee!";
    }

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "latte") String name){
        return coffeeService.newCoffee(name);
    }
}
