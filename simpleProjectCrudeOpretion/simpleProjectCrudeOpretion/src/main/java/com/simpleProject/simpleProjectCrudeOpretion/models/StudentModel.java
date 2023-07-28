package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Set;

@Data
public class StudentModel {
    private Long studentId;
    private  String studentName;
    private String studentMobileNumber;
    private String studentAddress;
    private List<CourseModel> courseModels;
}
