package com.example.StudentManagement.SMS.Service.impl;

import com.example.StudentManagement.SMS.Entity.Student;
import com.example.StudentManagement.SMS.Repository.StudentRepository;
import com.example.StudentManagement.SMS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {


    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void store(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        Student student=getStudentById(id);
        studentRepository.delete(student);
    }

}
