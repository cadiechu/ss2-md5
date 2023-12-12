package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.subject.SubjectService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/subject", produces = MediaType.APPLICATION_JSON_VALUE)
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    //Lấy về toàn bộ danh sách sinh viên
    @GetMapping
    public List<SubjectDto> findAll() {
        return subjectService.findAll();
    }
}
