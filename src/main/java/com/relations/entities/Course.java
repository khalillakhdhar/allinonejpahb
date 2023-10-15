package com.relations.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Course extends Audit {
	private String courseName;
	
	@ManyToMany(mappedBy = "courses")
	@JsonBackReference
	private Set<Student> students = new HashSet<>();
}
