package com.ust.spring.controller;

import com.ust.spring.model.Student;
import com.ust.spring.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
    @Autowired
    private Studentservice service;


    @PostMapping("/addstudent")

    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
}