package com.example.StudentManagement.SMS.Service;

import com.example.StudentManagement.SMS.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAll();

    void store(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
