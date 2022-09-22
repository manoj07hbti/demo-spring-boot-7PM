package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.service.AppFLowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFLowController {

    @Autowired
    AppFLowService service;


    @GetMapping("/app_flow")
    public String appFlow(){

       /* AppFLowService obj= new AppFLowService();
        obj.appFlow();*/
        return service.appFlow();
    }
}
