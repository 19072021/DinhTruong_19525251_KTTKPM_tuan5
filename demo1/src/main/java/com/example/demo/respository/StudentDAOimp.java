package com.example.demo.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;

@Repository
@Transactional
public class StudentDAOimp implements StudentDAO {
    public static final String HASH_KEY = "Student";

    private final RedisTemplate template;

    StudentDAOimp(RedisTemplate template) {
        this.template = template;
    }

    @Override
    public List<Student> findAll() {
        // TODO Auto-generated method stub
        return template.opsForHash().values(HASH_KEY);
    }

    @Override
    public Student save(Student student) {
        // TODO Auto-generated method stub
        template.opsForHash().put(HASH_KEY, student.getMaSV(), student);
        return student;
    }

    @Override
    public Student findStudentById(int maSV) {
        // TODO Auto-generated method stub
        return (Student) template.opsForHash().get(HASH_KEY, maSV);
    }

    @Override
    public String delete(int maSV) {
        // TODO Auto-generated method stub
        template.opsForHash().delete(HASH_KEY, maSV);
        return "student removed !!";
    }
}
