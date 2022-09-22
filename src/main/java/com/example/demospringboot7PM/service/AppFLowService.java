package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.repository.AppFLowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFLowService {

    @Autowired
    AppFLowRepo repo;

    public String appFlow(){


        return repo.appFlow();
    }

}
