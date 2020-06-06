package com.alpeshvalia.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreeterProperties.class)
public class GreetingAutoConfiguration {
    @Autowired
    private GreeterProperties greeterProperties;

    @Bean
    public Greeter greeter() {
        return new Greeter(greeterProperties);
    }

}
