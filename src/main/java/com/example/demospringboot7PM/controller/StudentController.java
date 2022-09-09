package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    //CRUD Operation

    ArrayList <Student> studentArrayList= new ArrayList<>();

    // C- CREATE/ADD END POINT

    @RequestMapping("add_student/{name}/{age}/{dept}")
    public String add(@PathVariable String name,@PathVariable int age, @PathVariable String dept){

     // CREATE OBJECT OF STUDENT
     Student student= new Student(name,age,dept);
     studentArrayList.add(student);

     return "Student added Successfully .....";
    }

    //R- READ or GET
    @RequestMapping("/students")
    public ArrayList<Student>  getStudentArrayList(){

        return studentArrayList;
    }

    //U- update

    @RequestMapping("/update_student")
    public String updateName(@RequestParam String name,@RequestParam int index){
       Student student= studentArrayList.get(index);
       student.setName(name);

       return "Successfully updated name ";
    }

    //D- delete
    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index){

        studentArrayList.remove( index);
        return "Successfully removed Student at given index ";
    }


}
