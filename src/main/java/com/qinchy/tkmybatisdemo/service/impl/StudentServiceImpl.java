package com.qinchy.tkmybatisdemo.service.impl;

import com.qinchy.tkmybatisdemo.dao.StudentMapper;
import com.qinchy.tkmybatisdemo.model.Student;
import com.qinchy.tkmybatisdemo.model.StudentExample;
import com.qinchy.tkmybatisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        StudentExample studentExample = new StudentExample();
        return studentMapper.selectByExample(studentExample);
    }
}
