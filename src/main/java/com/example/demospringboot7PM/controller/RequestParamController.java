package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

//SYNTAX   endpoint?param_name=value
    @RequestMapping("/info")
    public String info(@RequestParam String name){

        return "This is a Spring Boot Application with Request Param: "+name;
    }


    @RequestMapping("/skills")
    public String skills(@RequestParam String name,@RequestParam String skill){

        return "This Person :"+name +" Has Skills :"+skill;
    }

}
