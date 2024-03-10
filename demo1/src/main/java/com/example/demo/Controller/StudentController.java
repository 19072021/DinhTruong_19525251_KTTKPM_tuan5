package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService dao;

    @PostMapping("/save")
    public Student save(@RequestBody Student student) {
        return dao.save(student);
    }

    @GetMapping("/findAll")
    public List<Student> getAllStudents() {
        return dao.findAll();
    }

    @GetMapping("findStudentById/{maSV}")
    public Student findOrder(@PathVariable int maSV) {
        return dao.findStudentById(maSV);
    }
    @DeleteMapping("delete/{maSV}")
    public String remove(@PathVariable int maSV)   {
        return dao.delete(maSV);
    }
}
