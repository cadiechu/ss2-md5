package com.example.demo.service.student;

import com.example.demo.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById();

}
