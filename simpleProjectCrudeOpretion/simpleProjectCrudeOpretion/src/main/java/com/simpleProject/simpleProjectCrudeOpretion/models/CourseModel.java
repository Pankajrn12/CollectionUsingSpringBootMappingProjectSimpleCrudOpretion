package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import java.util.Set;

@Data
public class CourseModel {
    private long courseId;
    private String courseName;
    private String courseDuration;
    private String coursePrice;
    private Set<StudentModel> studentModels;
}
