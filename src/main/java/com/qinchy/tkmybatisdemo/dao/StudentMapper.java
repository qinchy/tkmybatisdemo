package com.qinchy.tkmybatisdemo.dao;

import com.qinchy.tkmybatisdemo.model.Student;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface StudentMapper extends Mapper<Student> {
    /*
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);
    */
}