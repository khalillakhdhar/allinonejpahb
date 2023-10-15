package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
