package com.msf.Springboot.Learning.task.controller;

import com.msf.Springboot.Learning.task.model.Course1;
import com.msf.Springboot.Learning.task.model.Student;
import com.msf.Springboot.Learning.task.model.Student1;
import com.msf.Springboot.Learning.task.repository.Course1Repository;
import com.msf.Springboot.Learning.task.repository.Student1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class Student1Controller {
    @Autowired
    private Student1Repository student1Repository;

    @Autowired
    private Course1Repository course1Repository;

    @PostMapping("/student1/add")
    public Student1 saveStudent1(@RequestBody Student1 student1) {
        return student1Repository.saveAndFlush(student1);
    }

    @PostMapping("/course1/add")
    public Course1 saveCourse1(@RequestBody Course1 course1) {
        return course1Repository.save(course1);
    }

    @GetMapping("/get/course/by/student")
    public Set<Course1> getAllCourses(@RequestParam Long id) {
        return student1Repository.getReferenceById(id).getCourse1s();
    }
}
