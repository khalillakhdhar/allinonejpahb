package com.relations.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relations.entities.Student;
import com.relations.repo.StudentRepository;
import com.relations.services.StudentService;
@Service
public class StudentServiceImplement implements StudentService {
	
	private final StudentRepository studentRepository;
	@Autowired
	public StudentServiceImplement(StudentRepository studentRepository) {
	this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Long studentId) {
		// TODO Auto-generated method stub

	}

}
