package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = {"/Hello", "/greetings"})
    public String Hello() {
        return "Hello Spring Boot! \n Hello Tucho, ainda tem sdds dela ?";
    }
}
