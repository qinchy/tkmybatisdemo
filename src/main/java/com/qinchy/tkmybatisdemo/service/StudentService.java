package com.qinchy.tkmybatisdemo.service;

import com.qinchy.tkmybatisdemo.dao.StudentMapper;
import com.qinchy.tkmybatisdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {

    /**
     * 查询所有学生
     * @return
     */
    public List<Student> findAll();
}
