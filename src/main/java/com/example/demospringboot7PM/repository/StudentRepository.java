package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByName(String name);

    public Student findByAge(int age);

    @Query(value = "SELECT * FROM Student  WHERE name = :name and age= :age", nativeQuery = true)
    public Student findByNameAndAge(@Param("name") String name,@Param("age") int age);
}
