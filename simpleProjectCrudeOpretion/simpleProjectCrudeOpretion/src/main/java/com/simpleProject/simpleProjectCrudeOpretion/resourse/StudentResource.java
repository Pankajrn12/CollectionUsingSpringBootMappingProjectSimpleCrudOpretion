package com.simpleProject.simpleProjectCrudeOpretion.resourse;

import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapping")
public class StudentResource {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudentDetailsManyToManyBidirectional")
    public ResponseEntity saveStudentDetailsManyToManyBidirectional(@RequestBody StudentModel studentModel){
        return studentService.saveStudentDetailsManyToManyBidirectional(studentModel);
    }
}
