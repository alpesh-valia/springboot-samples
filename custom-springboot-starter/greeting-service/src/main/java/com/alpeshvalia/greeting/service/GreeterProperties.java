package com.alpeshvalia.greeting.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "greeter")
public class GreeterProperties {
    private String greeting;
    private String salutation;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
