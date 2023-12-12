package com.example.demo.controller;

import com.example.demo.service.student.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Student;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v2/admin/student", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;
    //Lấy về toàn bộ danh sách sinh viên
    @GetMapping
    public List<Student> findAll() {
       return studentService.findAll();
    }
}
