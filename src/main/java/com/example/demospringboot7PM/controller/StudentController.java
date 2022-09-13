package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    //CRUD Operation

    ArrayList <Student> studentArrayList= new ArrayList<>();

    // C- CREATE/ADD END POINT

    @RequestMapping("/add_std")
    public String add_student(@RequestBody Student student){

        studentArrayList.add(student);

        return "Successfully added Student into List using Request Body";
    }

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
