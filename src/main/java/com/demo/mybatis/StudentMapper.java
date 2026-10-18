package com.demo.mybatis;

import java.util.List;

public interface StudentMapper {
    List<Student> findAll();
    int insertStudent(Student student);
    int deleteStudent(Student student);
}
