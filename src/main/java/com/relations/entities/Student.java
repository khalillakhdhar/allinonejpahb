package com.relations.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student  extends Audit{
	private String name;
	@OneToOne
	@JoinColumn(name = "address_id")
	private Adress address;
	
	@ManyToMany
	@JoinTable(
	name = "student_courses",
	joinColumns = @JoinColumn(name = "student_id"),
	inverseJoinColumns = @JoinColumn(name = "course_id")
	)
	private Set<Course> courses = new HashSet<>();
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Subject> subjects = new ArrayList<>();
}
