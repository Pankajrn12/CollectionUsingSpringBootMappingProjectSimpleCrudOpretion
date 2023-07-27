package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import java.util.Set;

@Data
public class StudentModel {
    private Long studentId;
    private String studentName;
    private String studentAddress;
    private String studentMobileNumber;
    private Set<CourseModel> courseModels;
}
