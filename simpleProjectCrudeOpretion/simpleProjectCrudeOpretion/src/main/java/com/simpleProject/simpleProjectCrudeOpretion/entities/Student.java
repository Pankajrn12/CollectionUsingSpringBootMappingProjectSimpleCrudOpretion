package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private  String studentName;
    private String studentMobileNumber;
    private String studentAddress;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_Course",
            joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}
