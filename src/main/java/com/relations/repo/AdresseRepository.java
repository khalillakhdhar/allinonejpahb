package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.entities.Adress;

public interface AdresseRepository extends JpaRepository<Adress, Long> {

}
