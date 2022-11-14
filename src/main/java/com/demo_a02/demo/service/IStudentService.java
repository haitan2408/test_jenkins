package com.demo_a02.demo.service;

import com.demo_a02.demo.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    void save(Student student);

    Student getStudentById(int id);
}
