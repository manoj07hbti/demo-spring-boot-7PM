package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @RequestMapping("/add/{a}/{b}")

    public String  add(@PathVariable int a, @PathVariable int b){

        return "ADDITION IS: " + (a+b);
    }

    @RequestMapping("/addition")
    public String addition(@RequestParam int a, @RequestParam int b ){

        return "ADDITION IS : "+(a+b);
    }
}
