package com.lille1.ParcsJardinsLillios.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lille1.ParcsJardinsLillios.Entity.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ParcJardinRepository extends JpaRepository<ParcJardin, Long>{
	
	public List<ParcJardin> findByNameContaining(String name);
	public List<ParcJardin> findAll();
	public ParcJardin findByName(String PJ);
	public ParcJardin findById(Long id);
	public List<ParcJardin> findByCategories(Categorie categorie);

	public List<ParcJardin> findByType(String type);
	@Query("select distinct P from ParcJardin P where P.L=:l and P.G=:g")
	public ParcJardin trouverPJparLG(@Param("l") String L, @Param("g") String G);




}
