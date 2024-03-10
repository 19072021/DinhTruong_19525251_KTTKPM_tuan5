package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentDAO;

@Service
@Transactional
public class StudentServiceimp implements StudentService {
    @Autowired
    private StudentDAO dao;

    @Override
    public List<Student> findAll() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }

    @Override
    public Student save(Student student) {
        // TODO Auto-generated method stub
        return dao.save(student);
    }

    @Override
    public Student findStudentById(int maSV) {
        // TODO Auto-generated method stub
        return dao.findStudentById(maSV);
    }

    @Override
    public String delete(int maSV) {
        // TODO Auto-generated method stub
        return dao.delete(maSV);
    }

}
