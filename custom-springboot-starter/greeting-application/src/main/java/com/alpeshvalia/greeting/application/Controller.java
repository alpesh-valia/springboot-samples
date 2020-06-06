package com.alpeshvalia.greeting.application;

import com.alpeshvalia.greeting.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Greeter greeter;

    @GetMapping("/greet/{name}")
    public ResponseEntity<String> greeting(@PathVariable("name") String name) {
        return ResponseEntity.ok(greeter.greet(name));
    }
}
