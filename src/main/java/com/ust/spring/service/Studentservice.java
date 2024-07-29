package com.ust.spring.service;

import com.ust.spring.model.Student;
import com.ust.spring.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {
    @Autowired
    private Studentrepository repo;


    public Student addStudent(Student student) {
        return repo.save(student);
    }
}