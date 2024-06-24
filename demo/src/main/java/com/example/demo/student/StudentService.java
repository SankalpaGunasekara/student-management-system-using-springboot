package com.example.demo.student;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public List<Student> getStudentDetails() {
        return List.of(new Student(1L, "sankalpa", null, null, null));
    }

}
