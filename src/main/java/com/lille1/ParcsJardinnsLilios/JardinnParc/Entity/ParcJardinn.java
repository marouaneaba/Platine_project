package com.lille1.ParcsJardinnsLilios.JardinnParc.Entity;

import javax.persistence.*;

@Entity
public class ParcJardinn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	@Column
	private String description;
	
	
	public ParcJardinn(){}
	
	public ParcJardinn(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
