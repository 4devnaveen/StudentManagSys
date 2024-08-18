package com.example.StudentManagement.SMS;

import com.example.StudentManagement.SMS.Entity.Student;
import com.example.StudentManagement.SMS.Repository.StudentRepository;
import com.example.StudentManagement.SMS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1=new Student("Naveen","mani","naveen@gmail.com");
//		Student student2=new Student("Sanjeevi","mani","sanjeevi@gmail.com");
//		Student student3=new Student("Kavin","venky","kavin@gmail.com");
//
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
	}
}
