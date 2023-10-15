package com.relations.services;

import java.util.List;

import com.relations.entities.Subject;

public interface SubjectService {
	public List<Subject> getAllSubjects();
	public Subject createSubject(Subject subject);
	public void deleteSubject(Long subjectId) ;
	
}
