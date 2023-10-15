package com.relations.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Adress extends Audit {
	private String street;
	private String city;
	@OneToOne(mappedBy = "address")
	private Student student;
}
