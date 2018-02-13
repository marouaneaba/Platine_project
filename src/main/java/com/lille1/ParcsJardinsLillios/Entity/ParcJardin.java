package com.lille1.ParcsJardinsLillios.Entity;

import org.springframework.web.multipart.MultipartFile;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
public class ParcJardin implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private java.lang.String name;
	@Column
	private java.lang.String description;
	@Column
	private String type;  // parc ou jardin
	@Column
	private String L;
	@Column
	private String G;
	@Column
	private String adresse;
	@Column
	@ElementCollection(targetClass=String.class)
	private List<java.lang.String> NameImage;
	
	//@OneToMany(mappedBy = "parcJardinCommentaire")
		//@OneToMany
		//private List<Commentaire> commentaires = new ArrayList<>();

		/*@ManyToMany
		private List<Horaire> horaire = new ArrayList<>();*/
		
		//@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		/*@JoinTable(
			      name="ParcJardinn_Categorie",
			      joinColumns=@JoinColumn(name="parcJardin_id", referencedColumnName="id"),
			      inverseJoinColumns=@JoinColumn(name="categorie_id", referencedColumnName="id"))
		private List<Categorie> categories = new ArrayList<>();*/


	@ManyToMany(fetch = FetchType.EAGER)
	private List<Categorie> categories = new ArrayList<>();

	/*@Lob
	@Column(name="photos", length=100000)
	private byte[] photos;

	public byte[] getPhotos() {
		return photos;
	}


	public void setPhotos(byte[] photos) {
		this.photos = photos;
	}*/

	/*private List<String> photos;

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos.add(photos);
	}*/




	public ParcJardin(){}
	
	public ParcJardin(java.lang.String name, java.lang.String description, String type, String l, String g, java.lang.String adresse
			) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.L = l;
		this.G = g;
		this.adresse = adresse;
		//this.commentaires = new ArrayList<>();
		this.NameImage = new ArrayList<>();

	}

	
	public List<String> getNameImage() {
		return NameImage;
	}

	public void setNameImage(String nameImage) {
		NameImage.add(nameImage);
	}

	/*public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getL() {
		return L;
	}

	public void setL(String l) {
		L = l;
	}

	public String getG() {
		return G;
	}

	public void setG(String g) {
		G = g;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/*public List<Commentaire> getCommentaires() {
		return commentaires;
	}*/

	/*public void setCommentaires(Commentaire commentaires) {
		this.commentaires.add(commentaires);
	}*/

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(Categorie categories) {
		this.categories.add(categories);
	}
	/*public List<Horaire> getHoraire() {
		return horaire;
	}

	public void setHoraire(List<Horaire> horaire) {
		this.horaire = horaire;
	}
*/


	public void setCat(List<Categorie> cats){
		this.categories=cats;
	}
	@Override
	public String toString() {
		return "ParcJardin [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type + ", L="
				+ L + ", G=" + G + ", adresse=" + adresse + "]";
	}
	
	



	
}
