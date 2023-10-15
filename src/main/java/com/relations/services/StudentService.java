package com.relations.services;

import java.util.List;

import com.relations.entities.Student;

public interface StudentService {
	List<Student> getAllStudents();
	public Student createStudent(Student student);
	public void deleteStudent(Long studentId);
	

}
