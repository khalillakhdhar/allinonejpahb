package com.relations.services;

import java.util.List;

import com.relations.entities.Course;

public interface CourseService {
	public List<Course> getAllCourses();
	public Course createCourse(Course course);
	public void deleteCourse(Long courseId);
}
