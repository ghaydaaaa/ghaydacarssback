package com.stage.projet.services;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.projet.entities.Reservation;
import com.stage.projet.entities.User;
import com.stage.projet.entities.Voiture;
import com.stage.projet.entities.esprit.ReservationRepository;
import com.stage.projet.entities.esprit.UserRepository;
import com.stage.projet.entities.esprit.VoitureRepository;


@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository ;
    private VoitureRepository VoitureRepository;
    private UserRepository UserRepository;
    private Voiture voiture;

  
    public boolean createReservation(Reservation request) {
        User user = UserRepository.findById(request.getUser().getId()).orElse(null);
        Voiture voiture = VoitureRepository.findById(request.getVoiture()).orElse(null);

        if (user == null || voiture == null) {
            return false;
        }

        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setVoiture(voiture);
        reservation.setDate_debut(request.getDate_debut());
        reservation.setDate_fin(request.getDate_fin());
        
       
        voiture.setCarImage(request.getCarImage());

        reservationRepository.save(reservation);
        return true;
    }
}







