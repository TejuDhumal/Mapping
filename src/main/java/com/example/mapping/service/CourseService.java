package com.example.mapping.service;

import com.example.mapping.entity.Course;
import com.example.mapping.entity.Student;
import com.example.mapping.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    public Optional<Course> findByTitle(String title) {
        return courseRepository.findByTitle(title);
    }
}
