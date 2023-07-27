package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long courseId;
    private String courseName;
    private String courseDuration;
    private String coursePrice;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

}
