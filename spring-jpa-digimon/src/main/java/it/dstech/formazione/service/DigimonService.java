package it.dstech.formazione.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.formazione.model.Digimon;
import it.dstech.formazione.repository.DigimonRepository;

@Service
@Transactional
public class DigimonService {
	@Autowired DigimonRepository repo;
	
	public void save(Digimon digimon) {
		repo.save(digimon);
	}
	
	public List<Digimon> listAll() {
		return (List<Digimon>) repo.findAll();
	}
	
	public Digimon get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	

}
