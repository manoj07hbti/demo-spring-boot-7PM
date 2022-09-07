package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

// SYNTAX :   "/endpoint/{varName}"

    @RequestMapping("/msg/{name}")

    public String message(@PathVariable String name){

      return "Welcome to Spring Boot App : "+name;
    }

    // SYNTAX :   "/endpoint/{varName1}/{varName2}"

    @RequestMapping("vote/{name}/{age}")

    public String eligiblity(@PathVariable String name , @PathVariable int age){

        if(age>18){

            return name+ " Eligible for voting ...";
        }else {

            return name + " Not Eligible for voting ";
        }

    }
}
