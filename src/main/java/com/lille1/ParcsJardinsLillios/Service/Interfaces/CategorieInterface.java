package com.lille1.ParcsJardinsLillios.Service.Interfaces;

import java.util.List;

import com.lille1.ParcsJardinsLillios.Entity.*;

public interface CategorieInterface {

	
	public boolean AjouterCategoriePJ(Categorie Categorie);
	public Categorie ColsulterCategorieId(Long id);
	public void SupprimerCategorie(Long idPJ);
	public boolean ModifierCategorie(Categorie categorie, Long idCat);
	public List<Categorie> consulterCategories();

	public List<ParcJardin> ConsulterParcJardinParCategorie(Categorie categorie);




	
}
