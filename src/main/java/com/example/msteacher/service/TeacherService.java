package com.example.msteacher.service;

import com.example.msteacher.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    public List<Teacher>getAll() {
        // return (List<Teacher>) teacherRepository.findAll();
        Teacher teacher = new Teacher();
        teacher.setTeacherId(1);
        teacher.setDepartment("science");
        teacher.setName("ram");
        List<Teacher>  teacherList =  new ArrayList<>();
        teacherList.add(teacher);
        return teacherList;
    }
}
