package com.demo_a02.demo.service.impl;

import com.demo_a02.demo.model.Student;
import com.demo_a02.demo.repository.IStudentRepository;
import com.demo_a02.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> getAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        this.iStudentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
//        Optional<Student> student = iStudentRepository.findById(id);
//        if(student.isPresent()) {
//            return student.get();
//        } else {
//            return null;
//        }
        return iStudentRepository.findById(id).orElse(null);
    }
}
