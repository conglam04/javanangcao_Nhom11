package com.example.travel_suggestion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.travel_suggestion.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User>findByUsername(String username);
	Optional<User>findByEmail(String email);
	Optional<User> findByPhoneNumber(String phoneNumber);
}
