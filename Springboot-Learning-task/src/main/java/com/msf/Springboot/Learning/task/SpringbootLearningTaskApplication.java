package com.msf.Springboot.Learning.task;

import com.msf.Springboot.Learning.task.model.Laptop;
import com.msf.Springboot.Learning.task.model.Student;
import com.msf.Springboot.Learning.task.repository.StudentRepository;
import com.msf.Springboot.Learning.task.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLearningTaskApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootLearningTaskApplication.class, args);


    }


}