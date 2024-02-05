package com.example.demo.service;

import java.util.List;

import com.example.demo.Student;

public interface StudentService {
	Student createStudent (Student student);
	List<Student> getAllStudents();
}
