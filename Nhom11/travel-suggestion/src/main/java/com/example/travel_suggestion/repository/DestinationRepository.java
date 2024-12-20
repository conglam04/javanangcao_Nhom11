package com.example.travel_suggestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travel_suggestion.entity.DestinationEntity;
@Repository
public interface DestinationRepository extends JpaRepository<DestinationEntity, Long>{
	

}
