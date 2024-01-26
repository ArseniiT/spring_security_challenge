package com.wildcodeschool.spring_security_challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String[] secretBases() {
        return new String[]{"Paris", "Lyon", "Bordeaux", "Lille", "Toulouse", "Nantes"};
    }
}
