package com.university.system.service;

import com.university.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Object[]> getTopStudentsByCourseName(String courseName) {
        return studentRepository.findTopStudentsByCourseName(courseName);
    }

}
