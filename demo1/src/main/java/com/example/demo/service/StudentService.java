package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
@Service
public interface  StudentService {
    public List<Student> findAll();

    public Student save(Student student) ;

    public Student findStudentById(int maSV);


    public String delete(int maSV);

}
