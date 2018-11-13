package com.example2.demo2.service;

import com.example2.demo2.model.StudentModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentDao {


    @Select("select * from student")
    List<StudentModel> findAll();

    @Update("Update student set TEXT='Sample Text' where id=1")
    List<StudentModel> update();


    @Select("select * from student where id = #{id}")
    StudentModel findById(int id);
}
