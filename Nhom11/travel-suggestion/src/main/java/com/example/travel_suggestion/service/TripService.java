package com.example.travel_suggestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travel_suggestion.entity.Trip;
import com.example.travel_suggestion.repository.TripRepository;

@Service
public class TripService {
	@Autowired
	private TripRepository tripRepository;
	public List<Trip> getTripsWithinBudget(double budget){
		return tripRepository.findByTotalCostLessThanEqual(budget);
	}
	public List<Trip> getAllTrips(){
		return tripRepository.findAll();
	}
}
