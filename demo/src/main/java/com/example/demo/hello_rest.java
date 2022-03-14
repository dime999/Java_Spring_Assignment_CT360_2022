package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_rest {

    @GetMapping("/hello-rest")
    public String hello()
    {
        String hello="Hello World";
        return hello;
    }
}
