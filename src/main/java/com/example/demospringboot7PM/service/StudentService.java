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
    // update

    public String update (long id , String name){

        // 1 find out record
         Student student=repository.getById(id);// fetch student data from DB
        // 2 update the value and save to database
        student.setName(name);

        repository.save(student);

        return "Successfully updated name as "+name;
    }

    // delete
    public String delete(long id){

        repository.deleteById(id);// it will delete record of same id
        return "Successfully deleted data from DB";
    }


}
