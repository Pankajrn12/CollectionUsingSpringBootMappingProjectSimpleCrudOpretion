package com.simpleProject.simpleProjectCrudeOpretion.service;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Course;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Student;
import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public ResponseEntity saveStudentDetailsManyToManyBidirectional(StudentModel studentModel) {
//        List<Student> studentList = new ArrayList<>();
//        Student student = new Student();
//        student.setStudentId(studentModel.getStudentId());
//        student.setStudentName(studentModel.getStudentName());
//        student.setStudentAddress(studentModel.getStudentAddress());
//        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());
//        studentList.add(student);
//        List<Course> courseList = new ArrayList<>();
//        studentModel.getCourseModels().stream().forEach(data->{
//            Course course = new Course();
//            course.setCourseName(data.getCourseName());
//            course.setCourseDuration(data.getCourseDuration());
//            course.setCoursePrice(data.getCoursePrice());
//            course.setCourseId(data.getCourseId());
//            courseList.add(course);
//        });
//        student.setCourses(courseList);
//        studentRepository.saveAll(studentList);
//        return new ResponseEntity<>("Saved Here Student Details and Course Details Saved Here", HttpStatus.OK);

        Set<Student> studentSet = new HashSet<>();
        Student student = new Student();
        student.setStudentAddress(studentModel.getStudentAddress());
        student.setStudentName(studentModel.getStudentName());
        student.setStudentId(studentModel.getStudentId());
        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());
        studentSet.add(student);

        Set<Course> courseSet = new HashSet<>();
        studentModel.getCourseModels().stream().forEach(data->{
            Course course = new Course();
            course.setCourseId(data.getCourseId());
            course.setCoursePrice(data.getCoursePrice());
            course.setCourseDuration(data.getCourseDuration());
            course.setCourseName(data.getCourseName());

            courseSet.add(course);
        });
        student.setCourses(courseSet);
        studentRepository.saveAll(studentSet);
        return new ResponseEntity<>("Saved Here Student Details And Course Details Saved here", HttpStatus.OK);
    }
}
