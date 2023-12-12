package com.example.demo.service.student;

import com.example.demo.service.product.IProductService;
import com.example.demo.service.student.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;

import java.util.List;

@Service
@RequiredArgsConstructor // đánh dấu đã tạo contrustor theo các trường chỉ định
public class StudentService implements IStudentService {

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById() {
        return null;
    }
}


//
//    @Autowired
//    private IStudentRepository studentRepository;
//
//    public List<StudentDto> findAll() {
//        return studentRepository.findAll().stream().map(StudentDto::new).collect(Collectors.toList());
//    }
//
//    public Student findById(String id) {
//        return studentRepository.findById(id).orElse(null);
//    }
//
//    public Student delete(String id) {
//        Optional<Student> s = studentRepository.findById(id);
//        s.ifPresent(student -> studentRepository.deleteById(student.getStudentId()));
//        return s.orElse(null);
//    }
//
//    public Student add(StudentDto studentDto) {
//        Student student = studentRepository.save(new Student(studentDto));
//        return student;
//    }