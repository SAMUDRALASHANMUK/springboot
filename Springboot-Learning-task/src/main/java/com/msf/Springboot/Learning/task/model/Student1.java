package com.msf.Springboot.Learning.task.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_table")
public class Student1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String dept;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE_TABLE", joinColumns = {
            @JoinColumn(name = "student1_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "course1_id", referencedColumnName = "id")
            })
    @JsonManagedReference
    private Set<Course1> course1s;
}