package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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

    @RequestMapping("/course")
    public ArrayList<String> getCourse(){

        ArrayList<String> course= new ArrayList<>();
        course.add("Java");
        course.add("Spring Boot");
        course.add("Microservices");

        return course;
    }

    @RequestMapping("/student")
    public Student getStudent(){

        Student obj= new Student("Raj",23,"CS");

        return obj;
    }

}
