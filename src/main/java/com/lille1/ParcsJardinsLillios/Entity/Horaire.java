package com.lille1.ParcsJardinsLillios.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;



@Entity
public class Horaire implements Serializable {

	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String ouverture;
	@Column
	private String fermuture;
	@Column
	private String journee;
	
	@ManyToOne(targetEntity = ParcJardin.class)
	private ParcJardin parcJardin;

	
	public Horaire(){}
	
	public Horaire(String ouverture, String fermuture, String journee,ParcJardin parcJardin) {
		super();
		this.ouverture = ouverture;
		this.fermuture = fermuture;
		this.journee = journee;
		this.parcJardin = parcJardin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOuverture() {
		return ouverture;
	}

	public void setOuverture(String ouverture) {
		this.ouverture = ouverture;
	}

	public String getFermuture() {
		return fermuture;
	}

	public void setFermuture(String fermuture) {
		this.fermuture = fermuture;
	}

	public String getJournee() {
		return journee;
	}

	public void setJournee(String journee) {
		this.journee = journee;
	}

	public ParcJardin getParcJardinn() {
		return parcJardin;
	}

	public void setParcJardinn(ParcJardin parcJardinn) {
		this.parcJardin = parcJardin;
	}

	
	
	
	
	
	
	
	
	
}
