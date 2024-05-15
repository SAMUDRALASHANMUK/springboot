package com.msf.Springboot.Learning.task.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "course_table")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course1 {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String abbreviation;
    private int modules;
    private double fee;
    // mapped by bidirectioanl we picked student table as a parent
    @ManyToMany(mappedBy = "course1s", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Student1> student1s;
}