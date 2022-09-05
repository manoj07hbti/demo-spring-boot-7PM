package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    // access_spec return_type method_name() { CODE }

    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello, Welcome to Spring Boot .......");
    }


    @RequestMapping("/welcome")
    public String welcome(){

        String welcome="Welcome to Spring boot Application .....";

        return welcome;
    }
}
