package it.dstech.formazione.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.dstech.formazione.model.Allenatore;

public interface AllenatoreRepository extends CrudRepository<Allenatore, Integer> {
	

}
