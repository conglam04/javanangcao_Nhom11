package com.example.travel_suggestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travel_suggestion.entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long>{
	List<Trip> findByTotalCostLessThanEqual(double budget);

	@Override
	List<Trip> findAll();
}
