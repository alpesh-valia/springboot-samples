package com.alpeshvalia.greeting.application;

import com.alpeshvalia.greeting.service.EnableGreeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableGreeter
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
