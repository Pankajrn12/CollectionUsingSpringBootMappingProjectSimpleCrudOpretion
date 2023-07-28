package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Set;

@Data
public class CourseModel {
    private Long courseId;
    private String courseName;
    private String coursePrice;
    private List<StudentModel> studentModels;
}
