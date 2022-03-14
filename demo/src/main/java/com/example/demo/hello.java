package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
public class hello {

    @RequestMapping(value="/hello", method=GET)
    @ResponseBody
    public String hello() {

        return "Hello World";
    }
}
