package com.northcoders.drinksapi.service;

import com.northcoders.drinksapi.model.Soda;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class SodaService {

    private final AtomicLong counter = new AtomicLong();

    public Soda newSoda(String name){
        return new Soda(counter.incrementAndGet(), name);
    }
}
