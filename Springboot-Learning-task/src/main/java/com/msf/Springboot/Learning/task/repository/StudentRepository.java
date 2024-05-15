package com.msf.Springboot.Learning.task.repository;

import com.msf.Springboot.Learning.task.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
