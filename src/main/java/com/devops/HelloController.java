package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        return "Welcome to DevOps CI/CD Pipelin,  this is the test to understand the automation !";

    }
}
