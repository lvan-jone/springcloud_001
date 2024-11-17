package com.fen.service.impl;

import com.fen.entity.Student;
import com.fen.mapper.StudentMapper;
import com.fen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional(rollbackFor = Exception.class)
    public Student getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    public List<Student> getStudentList(Student student) {
        return studentMapper.getStudentList(student);
    }
}
