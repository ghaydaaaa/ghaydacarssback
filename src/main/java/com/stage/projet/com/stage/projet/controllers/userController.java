package com.stage.projet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stage.projet.entities.Reservation;
import com.stage.projet.entities.User;
import com.stage.projet.entities.Voiture;
import com.stage.projet.entities.esprit.UserRepository;
import com.stage.projet.entities.esprit.VoitureRepository;
import com.stage.projet.services.ReservationService;
import com.stage.projet.services.UserService;
import com.stage.projet.services.voitureservicee;
import com.stage.projet.services.VoitureMockService;

@RestController
@RequestMapping("/testuser")
public class userController {
	@Autowired
	private UserService userService;

	@Autowired
	private voitureservicee voitureService;
	
	@Autowired

	public User saveUser(@RequestBody User user) {
		User savedUser = userService.saveuser(user);
		return savedUser;
	}
	@PostMapping
	public List<User> obtenirUtilisateurs() {
		return userService.obtenirUtilisateurs();
	}
	
	}

