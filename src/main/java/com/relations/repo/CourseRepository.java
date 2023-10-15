package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
