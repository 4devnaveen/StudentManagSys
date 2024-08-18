package com.example.StudentManagement.SMS.Controller;


import com.example.StudentManagement.SMS.Entity.Student;
import com.example.StudentManagement.SMS.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students";
    }

    @GetMapping("/students/new")
    public String addStudents(Model model) {
        model.addAttribute("students", new Student());
        return "create_student";
    }

    @PostMapping("/students/add")
    public String storeNewStudent(@ModelAttribute("students") Student student) {
        studentService.store(student);
        return "redirect:/students";
    }

    @GetMapping("students/update")
    public String updateStudents(@RequestParam("studentId") Long studentId, Model model) {
        Student student = studentService.getStudentById(studentId);
        model.addAttribute("students", student);
        return "update-form";
    }

    @GetMapping("/students/delete")
    public String deleteStudent(@RequestParam("studentId") Long studentId) {
        studentService.deleteStudentById(studentId);

        return "redirect:/students";
    }
}