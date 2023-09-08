package com.stage.projet.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Reservation {
	private long id;
	private Date date_reservation;
	private Date date_debut;
	private Date date_fin;
	private String statut;
	@ManyToOne
	private User user;
	@ManyToOne
	private Voiture voiture ;

	public Reservation() {
		super();

	}



	public Reservation(long id, Date date_reservation, Date date_debut, Date date_fin, String statut, User user,
			Voiture voiture) {
		super();
		this.id = id;
		this.date_reservation = date_reservation;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.statut = statut;
		this.user = user;
		this.voiture = voiture;
	}



	



	public Voiture getVoiture() {
		return voiture;
	}



	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate_reservation() {
		return date_reservation;
	}

	public void setDate_reservation(Date date_reservation) {
		this.date_reservation = date_reservation;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date ate_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user1) {
		this.user = user1;
	}



	public byte[] getCarImage() {
		// TODO Auto-generated method stub
		return null;
	}



	
}

	


	



	
