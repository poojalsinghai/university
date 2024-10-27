package com.university.system.controller;

import com.university.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/top/{courseName}")
    public List<Object[]> getTopStudents(@PathVariable String courseName) {
        return studentService.getTopStudentsByCourseName(courseName);
    }
}
