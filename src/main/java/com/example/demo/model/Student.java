package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import com.example.demo.dto.StudentDto;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(length = 4)
    private String studentId;

    @Column(length = 100)
    private String studentName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Column
    private Date birthDay;

    private Boolean gender;

    @Column(columnDefinition = "text")
    private String address;
    @Column(length = 45)
    private String phoneNumber;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Mark> markList;

}
