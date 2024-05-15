package com.msf.Springboot.Learning.task.service;

import com.msf.Springboot.Learning.task.model.Laptop;
import com.msf.Springboot.Learning.task.model.Student;
import com.msf.Springboot.Learning.task.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> addData() {
        Student student = new Student();
        student.setStudentId(10L);
        student.setStudentName("shanmuk");
        student.setAbout("I am engineer");
        Laptop laptop = new Laptop();
        laptop.setModelNumber("12");
        laptop.setBrand("Dell");
        student.setLaptop(laptop);
        studentRepository.save(student);
        return studentRepository.findAll();
    }
}
