package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class FirstController {

    @RequestMapping("/")
    public String index() {
        return "Hello Davison Spring Boot!";
    }

}