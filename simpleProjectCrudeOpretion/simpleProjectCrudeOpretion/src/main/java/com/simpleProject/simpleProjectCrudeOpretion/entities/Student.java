package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentAddress;
    private String studentMobileNumber;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_course",
    joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses;

}
