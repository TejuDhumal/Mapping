package com.example.mapping.service;

import com.example.mapping.entity.Student;
import com.example.mapping.repository.CourseRepository;
import com.example.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;


    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudent() {
        return  studentRepository.findAll();
    }

    public Optional<Student> findStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }

}
