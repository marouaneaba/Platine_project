package com.lille1.ParcsJardinnsLilios.Entity;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class CategorieEntity {

	@Id
	private Long id;
	@Column
	private Collection<Long> id_ParcJardinn;
	@Column
	private String categorie;
	public CategorieEntity(Collection<Long> id_ParcJardinn, String categorie) {
		super();
		this.id_ParcJardinn = id_ParcJardinn;
		this.categorie = categorie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Collection<Long> getId_ParcJardinn() {
		return id_ParcJardinn;
	}
	public void setId_ParcJardinn(Collection<Long> id_ParcJardinn) {
		this.id_ParcJardinn = id_ParcJardinn;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
	
	
}
