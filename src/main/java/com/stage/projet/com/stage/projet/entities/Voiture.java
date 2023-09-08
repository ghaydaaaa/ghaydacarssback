package com.stage.projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tableVoiture")
public class Voiture implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String Model; 
	private String marque;
	private String couleur;
	private byte[] carImage;
	@ManyToOne
	private User user;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getModel() {
		return Model;
	}



	public void setModel(String model) {
		this.Model = model;
	}

	
	
	    

	public Voiture() {
		super();

	}

	

	


	public Voiture(Long id, String name, String model, String marque, String couleur, byte[] carImage, User user) {
		super();
		this.id = id;
		this.name = name;
		this.Model = model;
		this.marque = marque;
		this.couleur = couleur;
		this.carImage = carImage;
		this.user = user;
	}



	public byte[] getCarImage() {
		return carImage;
	}



	public void setCarImage(byte[] carImage) {
		this.carImage = carImage;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
