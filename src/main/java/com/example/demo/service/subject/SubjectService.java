package com.example.demo.service.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.SubjectDto;
import com.example.demo.repository.ISubjectRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectService {
    @Autowired
    private ISubjectRepository subjectRepository;

    public List<SubjectDto> findAll() {
        return subjectRepository.findAll().stream().map(SubjectDto::new).collect(Collectors.toList());
    }
}
