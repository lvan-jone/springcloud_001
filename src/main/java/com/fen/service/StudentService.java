package com.fen.service;

import com.fen.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudentList(Student student);

    public Student getStudentById(int id);
}
