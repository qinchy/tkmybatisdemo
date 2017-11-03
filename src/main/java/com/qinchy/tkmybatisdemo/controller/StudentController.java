package com.qinchy.tkmybatisdemo.controller;

import com.qinchy.tkmybatisdemo.model.Student;
import com.qinchy.tkmybatisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/student/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
