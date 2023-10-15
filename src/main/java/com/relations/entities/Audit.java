package com.relations.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Audit {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
}
