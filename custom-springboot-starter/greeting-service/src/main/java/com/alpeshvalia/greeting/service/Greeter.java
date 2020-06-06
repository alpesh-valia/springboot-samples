package com.alpeshvalia.greeting.service;

public class Greeter {
    private final GreeterProperties greeterProperties;

    public Greeter(GreeterProperties greeterProperties) {
        this.greeterProperties = greeterProperties;
    }

    public String greet(String name) {
        return String.format("%s, %s %s", greeterProperties.getGreeting(), greeterProperties.getSalutation(), name);
    }
}
