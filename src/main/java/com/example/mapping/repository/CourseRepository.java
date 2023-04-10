package com.example.mapping.repository;

import com.example.mapping.entity.Course;
import com.example.mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    Optional<Course> findByTitle(String title);
}
