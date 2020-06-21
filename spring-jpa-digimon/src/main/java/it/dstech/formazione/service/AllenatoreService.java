package it.dstech.formazione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.formazione.model.Allenatore;
import it.dstech.formazione.model.Digimon;
import it.dstech.formazione.repository.DigimonRepository;
import it.dstech.formazione.repository.AllenatoreRepository;

@Service
@Transactional
public class AllenatoreService {
	@Autowired AllenatoreRepository repo;
	
	public void save(Allenatore allenatore) {
		repo.save(allenatore);
	}
	
	public List<Allenatore> listAll() {
		return (List<Allenatore>) repo.findAll();
	}
	
	public Allenatore get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	

}
