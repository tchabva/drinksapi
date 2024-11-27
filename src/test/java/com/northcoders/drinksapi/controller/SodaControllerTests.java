package com.northcoders.drinksapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class SodaControllerTests {
    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testSodaLover() throws Exception {

        String expectedContent = "I like Soda!";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/sodalover"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void testSodaDefaultValue() throws Exception {

        String expectedValue = "coke";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/soda").param("name", "coke"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedValue));
    }

    @Test
    public void testSoda() throws Exception {

        String expectedValue = "fanta";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/soda").param("name","fanta"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedValue));
    }
}
