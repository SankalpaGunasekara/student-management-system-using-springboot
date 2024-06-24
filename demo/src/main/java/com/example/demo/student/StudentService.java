package com.example.demo.student;

import java.util.List;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudentDetails() {
        return List.of(new Student(1L, "sankalpa", null, null, null));
    }

    public String printHello() {
        return "Hello";
    }
}
