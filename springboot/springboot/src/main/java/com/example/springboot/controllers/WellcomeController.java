package com.example.springboot.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {
    @GetMapping
    public String welcome() {
        return "Wellcome to mt Spring Boot API";
    }
    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS', 'USERS')")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    @PreAuthorize("haRole('MANAGERS')")
    public String managers(){
        return "Authorized manager";
    }
}
