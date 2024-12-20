package com.example.travel_suggestion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Travel Suggestion");
        return "home";
	}
	@GetMapping("/destination")
    public String destinations() {
        return "destination"; // Trang điểm đến
    }
}
