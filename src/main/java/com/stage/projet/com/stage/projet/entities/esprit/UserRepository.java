package com.stage.projet.entities.esprit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stage.projet.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findById( Long id);

}

