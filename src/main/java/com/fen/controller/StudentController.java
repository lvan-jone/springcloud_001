package com.fen.controller;


import com.fen.entity.Student;
import com.fen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 通过构造方法的方式注入 StudentMapper
     */
    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        Student student = studentService.getStudentById(id);
        return student;
    }

    @GetMapping("/getStudentList")
    public Object getStudentList(Student student) {
        return studentService.getStudentList(student);
    }

}

