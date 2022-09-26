package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import com.example.demospringboot7PM.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    @Autowired
    StudentRepository repository;

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

    //U

    @PutMapping("update_std_db")
    public String update(@RequestParam long id,@RequestParam String name){

      return   service.update(id,name);

    }

    // delete
    @DeleteMapping("delete_std_db")
    public String delete(@RequestParam long id){

        return service.delete(id);
    }

    @GetMapping("/findbyname")
    public Student student(@RequestParam String name){

      return  service.findByName(name);
    }

    @GetMapping("/findbyage")
    public Student findByAge(@RequestParam int age){

        return  service.findByAge(age);
    }
}
