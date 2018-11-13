package com.example2.demo2.service;

import com.example2.demo2.dao.StudentDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentService {


    @Select("select * from student")
    List<StudentDao> findAll();
}
