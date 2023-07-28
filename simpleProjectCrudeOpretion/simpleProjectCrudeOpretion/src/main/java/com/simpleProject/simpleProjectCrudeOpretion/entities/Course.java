package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private String coursePrice;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

}
