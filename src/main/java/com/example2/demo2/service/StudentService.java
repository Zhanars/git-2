package com.example2.demo2.service;

import com.example2.demo2.dao.StudentDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentService {


    @Select("select * from student")
    List<StudentDao> findAll();

    @Update("Update student set TEXT='Sample Text' where id=1")
    List<StudentDao> update();

}
