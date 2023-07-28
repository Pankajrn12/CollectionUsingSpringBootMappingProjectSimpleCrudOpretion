package com.simpleProject.simpleProjectCrudeOpretion.services;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Course;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Student;
import com.simpleProject.simpleProjectCrudeOpretion.models.CourseModel;
import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public ResponseEntity saveStudentDetailsManyToManyBiDirectional(StudentModel studentModel) {
                                  // Use of LinkedHashSet
//        Set<Student> studentSet = new LinkedHashSet<>();
//        Student student = new Student();
//        student.setStudentId(studentModel.getStudentId());
//        student.setStudentName(studentModel.getStudentName());
//        student.setStudentAddress(studentModel.getStudentAddress());
//        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());
//        studentSet.add(student);
//        Set<Course> courseSet = new LinkedHashSet<>();
//        studentModel.getCourseModels().stream().forEach(data->{
//            Course course = new Course();
//            course.setCoursePrice(data.getCoursePrice());
//            course.setCourseName(data.getCourseName());
//            course.setCourseId(data.getCourseId());
//            courseSet.add(course);
//        });
//        student.setCourses(courseSet);
//        studentRepository.saveAll(studentSet);
//        return new ResponseEntity<>("Saved Student Details And Course Details Saved Here", HttpStatus.OK);

                // Use Of Vector in Collection part

//        List<Student> studentList = new Vector<>();
//        Student student = new Student();
//        student.setStudentAddress(studentModel.getStudentAddress());
//        student.setStudentId(studentModel.getStudentId());
//        student.setStudentName(studentModel.getStudentName());
//        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());
//        studentList.add(student);
//
//        List<Course> courseList = new Vector<>();
//        studentModel.getCourseModels().stream().forEach(data->{
//            Course course = new Course();
//            course.setCourseId(data.getCourseId());
//            course.setCourseName(data.getCourseName());
//            course.setCoursePrice(data.getCoursePrice());
//            courseList.add(course);
//        });
//        student.setCourses(courseList);
//        studentRepository.saveAll(studentList);
//        return new ResponseEntity<>("/saved Student And Course Details Saved Here", HttpStatus.OK);

                                         // Use Of Stack
        List<Student> studentList = new Stack<>();
        Student student = new Student();
        student.setStudentName(studentModel.getStudentName());
        student.setStudentId(studentModel.getStudentId());
        student.setStudentAddress(studentModel.getStudentAddress());
        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());
        studentList.add(student);

        List<Course> courseList = new Stack<>();
        studentModel.getCourseModels().stream().forEach(data->{
            Course course = new Course();
            course.setCourseId(data.getCourseId());
            course.setCourseName(data.getCourseName());
            course.setCoursePrice(data.getCoursePrice());
            courseList.add(course);
        });
        student.setCourses(courseList);

        studentRepository.saveAll(studentList);
        return new ResponseEntity<>("Saved here", HttpStatus.OK);

    }
}
