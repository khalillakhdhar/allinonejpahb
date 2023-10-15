package com.relations.services.implementation;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.relations.entities.Subject;
import com.relations.repo.SubjectRepository;
import com.relations.services.SubjectService;

public class SubjectServiceImplement implements SubjectService{

	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject createSubject(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSubject(Long subjectId) {
		// TODO Auto-generated method stub

	}

}
