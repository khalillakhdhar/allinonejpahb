package com.relations.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Adress extends Audit {
	private String street;
	private String city;
	@OneToOne
	@MapsId
	@JoinColumn(name = "student_id")

	private Student student;
}
