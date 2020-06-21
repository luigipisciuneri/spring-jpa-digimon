package it.dstech.formazione.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Digimon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private int attacco;
	private int difesa;
	private int resistenza;
	private String evoluzione;
	//private String allenatore;
	
	@ManyToOne	
	private Allenatore Allenatore;



	public Digimon() {
	}

	public Digimon(int id, String name, int attacco, int difesa, int resistenza, String evoluzione,
			it.dstech.formazione.model.Allenatore allenatore) {
		super();
		this.id = id;
		this.name = name;
		this.attacco = attacco;
		this.difesa = difesa;
		this.resistenza = resistenza;
		this.evoluzione = evoluzione;
		Allenatore = allenatore;
	}


	public Allenatore getAllenatore() {
		return Allenatore;
	}

	public void setAllenatore(Allenatore allenatore) {
		Allenatore = allenatore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttacco() {
		return attacco;
	}

	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}

	public int getDifesa() {
		return difesa;
	}

	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}

	public int getResistenza() {
		return resistenza;
	}

	public void setResistenza(int resistenza) {
		this.resistenza = resistenza;
	}

	public String getEvoluzione() {
		return evoluzione;
	}

	public void setEvoluzione(String evoluzione) {
		this.evoluzione = evoluzione;
	}

	@Override
	public String toString() {
		return "Digimon [id=" + id + ", name=" + name + ", attacco=" + attacco + ", difesa=" + difesa + ", resistenza="
				+ resistenza + ", evoluzione=" + evoluzione + ", Allenatore=" + Allenatore + "]";
	}



}
