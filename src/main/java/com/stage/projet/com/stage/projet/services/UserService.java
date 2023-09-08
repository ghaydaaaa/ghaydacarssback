package com.stage.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.projet.entities.User;
import com.stage.projet.entities.esprit.UserRepository;




@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
    

	public List<User> obtenirUtilisateurs() {
		return userRepository.findAll();
	}
	


	public User saveuser(User user) {
		User utilisateur = new User();
		utilisateur.setNom(user.getNom());
		utilisateur.setPrenom(user.getPrenom());
		utilisateur = this.userRepository.save(utilisateur);
		System.out.println("l'utilisateur est " + utilisateur.getNom() + " " + utilisateur.getPrenom() + " "
				+ utilisateur.getId());

		return utilisateur;

	}

}