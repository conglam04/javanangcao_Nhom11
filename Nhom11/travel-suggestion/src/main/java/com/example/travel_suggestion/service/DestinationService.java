package com.example.travel_suggestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.travel_suggestion.entity.DestinationEntity;
import com.example.travel_suggestion.repository.DestinationRepository;

@Service
public class DestinationService {
	private final DestinationRepository destinationRepository;

    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    // Tạo mới một điểm đến
    public DestinationEntity createDestination(DestinationEntity destination) {
        return destinationRepository.save(destination);
    }

    // Lấy tất cả điểm đến
    public List<DestinationEntity> getAllDestinations() {
        return destinationRepository.findAll();
    }

    // Lấy thông tin điểm đến theo ID
    public Optional<DestinationEntity> getDestinationById(Long id) {
        return destinationRepository.findById(id);
    }

    // Cập nhật điểm đến
    public DestinationEntity updateDestination(Long id, DestinationEntity updatedDestination) {
        return destinationRepository.findById(id).map(destination -> {
            destination.setName(updatedDestination.getName());
            destination.setDescription(updatedDestination.getDescription());
            destination.setLocation(updatedDestination.getLocation());
            destination.setPrice(updatedDestination.getPrice());
            return destinationRepository.save(destination);
        }).orElseThrow(() -> new RuntimeException("Destination not found"));
    }

    // Xóa điểm đến
    public void deleteDestination(Long id) {
        destinationRepository.deleteById(id);
    }
}
