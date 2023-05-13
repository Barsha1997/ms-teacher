package com.example.msteacher.controller;

import com.example.msteacher.model.Teacher;
import com.example.msteacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

}
