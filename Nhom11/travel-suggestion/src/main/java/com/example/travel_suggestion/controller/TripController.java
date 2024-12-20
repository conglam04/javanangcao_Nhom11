package com.example.travel_suggestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.travel_suggestion.entity.Trip;
import com.example.travel_suggestion.service.TripService;

@Controller
@RequestMapping("/trips")
public class TripController {
	@Autowired
	private TripService tripService;

	@GetMapping("/suggestions")
	public List<Trip> getTripByBudget(@RequestParam double budget){
		return tripService.getTripsWithinBudget(budget);
	}
	@GetMapping
	public List<Trip> getAllTrips(){
		return tripService.getAllTrips();
	}

}
