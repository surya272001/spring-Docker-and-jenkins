package com.ust.spring.repository;

import com.ust.spring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  Studentrepository  extends JpaRepository<Student,Integer> {
}