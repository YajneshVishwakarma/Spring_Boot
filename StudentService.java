package com.example.demo.Student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents()
    {
        return List.of(
                new Student(
                        1L,
                        "Yajnesh",
                        "Yajnesh@mail.com",
                        LocalDate.of(2001,5,9),
                        21
                )
        );
    }
}
