package com.example2.demo2.controller;


import com.example2.demo2.Demo2Application;
import com.example2.demo2.dao.StudentDao;
import com.example2.demo2.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/get")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping("/text")
    public List<StudentDao> getAll(){
        System.out.println("поиск данных");
        return
                studentService.findAll();
    }
    @GetMapping("/stop")
    public void shutdownServer(){
        System.exit(0);
    }

    @GetMapping("/update")
    public void updateText() {
        studentService.update();
    }

}
