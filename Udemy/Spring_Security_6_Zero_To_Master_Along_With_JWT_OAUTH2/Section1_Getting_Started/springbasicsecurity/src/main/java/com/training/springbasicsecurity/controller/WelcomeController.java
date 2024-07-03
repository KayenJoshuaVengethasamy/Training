package com.training.springbasicsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String SayWelcome() {
//        section 1: return "Welcome to Spring Application without security";
        return "Welcome to Spring Application with security";
    }
}