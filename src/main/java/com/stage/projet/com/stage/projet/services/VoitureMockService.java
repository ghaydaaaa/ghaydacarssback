package com.stage.projet.services;
import com.stage.projet.entities.esprit.VoitureRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.stage.projet.entities.Voiture;

public class VoitureMockService implements voitureservicee {

	private List<Voiture> voiture;
	
	public VoitureMockService () {
		voiture=new ArrayList<Voiture> ();
		
		 (voiture).add(new Voiture());
	}

	
	
	@Override
	public List<Voiture> getCars() {
		return voiture;
	}

	  
	

	@Override
	public void deleteVoiture(Long id) {
        Voiture voiture = new Voiture();
        voiture.setId(id);
        voiture.remove(voiture);
	}

	@Override
	public void addVoiture(Voiture voiture) {
       Voiture.add(voiture);		
	}

	@Override
	public void updateVoiture(Voiture voiture) {
      voiture.remove(voiture);
      voiture.add(voiture);
	}

	@Override
	public void getCarsByMarqueAndColor(String marque, String coleur) {
		// TODO Auto-generated method stub
		
	}

}
