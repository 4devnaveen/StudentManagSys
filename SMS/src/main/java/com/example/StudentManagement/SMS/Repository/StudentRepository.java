package com.example.StudentManagement.SMS.Repository;

import com.example.StudentManagement.SMS.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
