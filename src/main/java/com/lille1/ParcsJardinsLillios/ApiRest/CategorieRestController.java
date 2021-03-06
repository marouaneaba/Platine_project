package com.lille1.ParcsJardinsLillios.ApiRest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lille1.ParcsJardinsLillios.Entity.Categorie;
import com.lille1.ParcsJardinsLillios.Service.Interfaces.CategorieInterface;

@RestController
public class CategorieRestController {

	@Autowired
	private CategorieInterface mCategorieInterface;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(value = "/api/Categorie")
	public List<Categorie> GetCategorie() {
		return mCategorieInterface.consulterCategories();
	}
	
	
	
}
