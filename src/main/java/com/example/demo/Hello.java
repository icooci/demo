package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {
    @RequestMapping("/")
    public String key(){
        return "Hello icooci Spring Boot ~ hhhhhhhhhhhh !";
    }
}
