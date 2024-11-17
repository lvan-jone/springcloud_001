package com.fen.mapper;


import com.fen.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Repository
@Mapper
public interface StudentMapper {
    // 根据id查询student的方法
    Student getStudentById(@Param("id") int id);

    // 查询student列表
    @Result(column = "other_message", property = "otherMessage")
    @Select("select * from student")
    List<Student> getStudentList(Student student);
}
