package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    //C
    @PostMapping("/add_std_db")
    public String add_student(@RequestBody Student student){


        return service.add(student);
    }

    // R

    @GetMapping("/students_db")
    public List<Student> getStudentArrayList(){

        return service.getAllStudent();
    }

}
