package com.relations.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Subject extends Audit {
	private String subjectName;
	@ManyToOne
	@JoinColumn(name = "student_id")
	@JsonBackReference
	private Student student;
}
