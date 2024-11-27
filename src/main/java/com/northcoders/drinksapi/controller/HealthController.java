package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthComponent;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    HealthService healthService;

    @Autowired
    HealthEndpoint healthEndpoint;

    @GetMapping("/health")
    public Health health(){
        return healthService.health();
    }

    @GetMapping("/healthier")
    public ResponseEntity<HealthComponent> healthier(){
        return new ResponseEntity<>(healthEndpoint.health(), HttpStatus.OK);
    }

    @GetMapping("/healthy")
    public ResponseEntity<Status> healthy(){
        return new ResponseEntity<>(Status.UP, HttpStatus.OK);
    }
}