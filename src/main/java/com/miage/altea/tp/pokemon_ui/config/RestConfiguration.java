package com.miage.altea.tp.pokemon_ui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Configuration

public class RestConfiguration {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
