package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String add(Student student){

         repository.save(student);// insert student data in database

        return "Student Added Successfully to DB ";
    }

    public List<Student> getAllStudent(){

      return   repository.findAll();// get all the data from table
    }
}
