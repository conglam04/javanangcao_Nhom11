package com.example.travel_suggestion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trips")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	 private String name;
	 private String location;
	 private double flightCost;
	 private double hotelCost;
	 private double foodCost;
	 private double entryFee;

	 @Column(insertable = false, updatable = false)
	 private double totalCost; //

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getFlightCost() {
		return flightCost;
	}

	public void setFlightCost(double flightCost) {
		this.flightCost = flightCost;
	}

	public double getHotelCost() {
		return hotelCost;
	}

	public void setHotelCost(double hotelCost) {
		this.hotelCost = hotelCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
}
