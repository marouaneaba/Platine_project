package com.lille1.ParcsJardinsLillios.Web;

import com.lille1.ParcsJardinsLillios.DAO.HoraireRepository;
import com.lille1.ParcsJardinsLillios.DAO.ParcJardinRepository;
import com.lille1.ParcsJardinsLillios.Entity.Horaire;
import com.lille1.ParcsJardinsLillios.Entity.ParcJardin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class horaireController {

    @Autowired
    HoraireRepository horaireRepository;
    @Autowired
    ParcJardinRepository parcJardinRepository;


    /**
     * 
     * @param model
     * @param id
     * @return
     */
    @GetMapping(value="/AjouterHoraire")
    public String GETajoutHoraire(Model model, long id){
    System.out.println("id de pj "+id);
    model.addAttribute("id",id);
        return "horaire";
    }

    /**
     * 
     * @param journee
     * @param ouverture
     * @param fermeture
     * @param id
     * @return
     */
    @PostMapping(value="/toto")
    public String AddHoraireToPJ(String journee, String ouverture, String fermeture, long id){

        System.out.println("id de pj apres valider"+journee);
       ParcJardin tmp= parcJardinRepository.findById(id);
        horaireRepository.save(new Horaire(ouverture,fermeture,journee,tmp));
        return "redirect:/operationPJ";
    }



}
