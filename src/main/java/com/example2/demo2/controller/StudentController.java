package com.example2.demo2.controller;


import com.example2.demo2.model.StudentModel;
import com.example2.demo2.service.StudentDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class StudentController {

    private StudentDao studentDaoService;

    public StudentController(StudentDao studentDaoService) {

        this.studentDaoService = studentDaoService;
    }

    @GetMapping("/text")
    public List<StudentModel> getAll(){
        System.out.println("поиск данных");
        return
                studentDaoService.findAll();
    }
    @GetMapping("/stop")
    public void shutdownServer(){
        System.exit(0);
    }

    @GetMapping("/update")
    public void updateText() {
        studentDaoService.update();
    }

}
