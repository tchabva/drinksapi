package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    HealthService healthService;

    @GetMapping("/health")
    public Health health(){
        return healthService.health();
    }

}
