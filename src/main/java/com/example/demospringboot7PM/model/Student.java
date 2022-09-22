package com.example.demospringboot7PM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "test_student_table")
public class Student {

    @Id
    @GeneratedValue
    long id;// primary key of Table 1,2,3,4......


    String name;
    int age;

    @Column(name="stream") // if we want to rename any column
    String section;

    // default constructor
    public Student() {
    }

    // parameterized constructor


    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
