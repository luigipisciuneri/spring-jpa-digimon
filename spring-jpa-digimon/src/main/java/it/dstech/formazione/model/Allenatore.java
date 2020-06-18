package it.dstech.formazione.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allenatore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nomeAllenatore;
	private String nomeDigimon;
	
	public Allenatore() {

	}

	public Allenatore(int id, String nomeAllenatore, String nomeDigimon) {
		super();
		this.id = id;
		this.nomeAllenatore = nomeAllenatore;
		this.nomeDigimon = nomeDigimon;
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

	public String getNomeDigimon() {
		return nomeDigimon;
	}

	public void setNomeDigimon(String nomeDigimon) {
		this.nomeDigimon = nomeDigimon;
	}
	
	
	

}
