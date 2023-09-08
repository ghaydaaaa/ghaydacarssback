package com.stage.projet.entities.esprit;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stage.projet.entities.User;
import com.stage.projet.entities.Voiture;
import org.springframework.stereotype.Repository;


public interface VoitureRepository extends JpaRepository<Voiture, Long> {

	List<Voiture> findByMarqueAndColor(String marque, String coleur);

	Optional<Voiture> findById(Voiture voiture);

}
