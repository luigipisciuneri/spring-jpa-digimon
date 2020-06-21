package it.dstech.formazione.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Allenatore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nomeAllenatore;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Digimon> listaDigimon;

	public Allenatore() {	

	}


	public Allenatore(int id, String nomeAllenatore, List<Digimon> listaDigimon) {
		super();
		this.id = id;
		this.nomeAllenatore = nomeAllenatore;
		this.listaDigimon = listaDigimon;
	}



	public List<Digimon> getListaDigimon() {
		return listaDigimon;
	}







	public void setListaDigimon(List<Digimon> listaDigimon) {
		this.listaDigimon = listaDigimon;
	}







	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeAllenatore() {
		return nomeAllenatore;
	}

	public void setNomeAllenatore(String nomeAllenatore) {
		this.nomeAllenatore = nomeAllenatore;
	}



	

	

	
}
