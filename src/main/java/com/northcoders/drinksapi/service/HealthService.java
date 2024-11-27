package com.northcoders.drinksapi.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private final Health health = Health.status(Status.UP).build();

    public Health health(){
        return health;
    }

}
