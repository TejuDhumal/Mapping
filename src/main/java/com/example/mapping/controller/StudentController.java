package com.example.mapping.controller;

import com.example.mapping.entity.Course;
import com.example.mapping.entity.Student;
import com.example.mapping.repository.CourseRepository;
import com.example.mapping.service.CourseService;
import com.example.mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;
    @PostMapping("add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("get")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
    @GetMapping("id/{studentId}")
    public Optional<Student> findStudent(@PathVariable Long studentId){
        return  studentService.findStudentById(studentId);
    }

    @GetMapping("title/{title}")
    public Optional<Course> findStudentByTitle(@PathVariable String title){
        return  courseService.findByTitle(title);
    }

}
