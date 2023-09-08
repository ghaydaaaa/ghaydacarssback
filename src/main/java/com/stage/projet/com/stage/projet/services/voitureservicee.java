package com.stage.projet.services;

import java.util.List;

import com.stage.projet.entities.Voiture;

public interface voitureservicee {

	List<Voiture> getCars();
	   
     void deleteVoiture(Long id);

    void addVoiture(Voiture voiture);
    
    void updateVoiture(Voiture voiture ) ;
    
    void  getCarsByMarqueAndColor(String marque, String coleur);	

}

