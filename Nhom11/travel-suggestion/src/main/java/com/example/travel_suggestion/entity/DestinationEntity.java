package com.example.travel_suggestion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="destinations")
public class DestinationEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destination_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String location;

    @Column(nullable = true)
    private Double price; // Giá trung bình cho chuyến đi

	public Long getDestination_id() {
		return destination_id;
	}

	public void setDestination_id(Long destination_id) {
		this.destination_id = destination_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

   
}
