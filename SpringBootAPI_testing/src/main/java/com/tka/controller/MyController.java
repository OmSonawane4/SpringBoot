package com.tka.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/w3school")
@RestController
public class MyController {

    @RequestMapping(value = "/html", method = RequestMethod.POST)
    public String firstAPI(){
        return "html stands for Hypertext markup language";
    }
    @GetMapping(value = "/java")
    public String secondAPI(){
        return "JAVA is an object oriented programming language";
    }
    @DeleteMapping("/sql")
    public String thirdAPI(){
        return "SQL is structured query language";
    }
}
