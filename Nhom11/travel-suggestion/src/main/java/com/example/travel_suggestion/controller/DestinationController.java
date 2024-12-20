package com.example.travel_suggestion.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.travel_suggestion.entity.DestinationEntity;
import com.example.travel_suggestion.service.DestinationService;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/destinations")
public class DestinationController {
	private final DestinationService destinationService;

    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

    // Hiển thị danh sách điểm đến
    @GetMapping
    public String listDestinations(Model model) {
        List<DestinationEntity> destinations = destinationService.getAllDestinations();
        model.addAttribute("destinations", destinations);
        return "destinations/list";
    }

    // Hiển thị form thêm mới điểm đến
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("destination", new DestinationEntity());
        return "destinations/create";
    }

    // Xử lý form thêm mới điểm đến
    @PostMapping("/create")
    public String createDestination(@ModelAttribute DestinationEntity destination) {
        destinationService.createDestination(destination);
        return "redirect:/destinations";
    }

    // Hiển thị form cập nhật điểm đến
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        DestinationEntity destination = destinationService.getDestinationById(id)
                .orElseThrow(() -> new RuntimeException("Destination not found"));
        model.addAttribute("destination", destination);
        return "destinations/edit";
    }

    // Xử lý cập nhật điểm đến
    @PostMapping("/edit/{id}")
    public String updateDestination(@PathVariable Long id, @ModelAttribute DestinationEntity destination) {
        destinationService.updateDestination(id, destination);
        return "redirect:/destinations";
    }

    // Xóa điểm đến
    @GetMapping("/delete/{id}")
    public String deleteDestination(@PathVariable Long id) {
        destinationService.deleteDestination(id);
        return "redirect:/destinations";
    }
    @PostConstruct
    public void init() {
        System.out.println("DestinationController loaded successfully");
    }
}
