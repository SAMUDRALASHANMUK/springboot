package com.msf.Springboot.Learning.task.controller;

import com.msf.Springboot.Learning.task.model.Student;
import com.msf.Springboot.Learning.task.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @GetMapping
    public List<Student> get() {
        return studentService.addData();
    }
}
