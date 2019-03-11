package com.schoolbus.resources;

import java.util.List;

import com.schoolbus.model.Student;
import com.schoolbus.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResources {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        
        List<Student> students = repository.findAll();

        return students;
    }
}