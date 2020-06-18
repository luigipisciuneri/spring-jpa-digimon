package it.dstech.formazione.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.dstech.formazione.model.Digimon;

public interface DigimonRepository extends CrudRepository<Digimon, Integer> {
	

}
