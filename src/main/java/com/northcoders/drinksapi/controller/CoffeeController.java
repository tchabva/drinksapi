package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import com.northcoders.drinksapi.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @GetMapping("/coffeelover")
    public ResponseEntity<String> coffeeLover(){
        return new ResponseEntity<>("I like Coffee!", HttpStatus.OK);
    }

    @GetMapping("/coffee")
    public ResponseEntity<Coffee> coffee(@RequestParam(value = "name", defaultValue = "latte") String name){
        return new ResponseEntity<>(coffeeService.newCoffee(name), HttpStatus.OK);
    }
}