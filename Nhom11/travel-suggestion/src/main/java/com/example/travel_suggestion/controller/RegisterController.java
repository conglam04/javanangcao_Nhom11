package com.example.travel_suggestion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.example.travel_suggestion.service.UserService;



@Controller
public class RegisterController {
	private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // Trả về view register.html
    }

    // Xử lý phương thức POST để xử lý dữ liệu từ form đăng ký
    @PostMapping("/register")
    public RedirectView registerUser(
        @RequestParam("username") String username,
        @RequestParam("email") String email,
        @RequestParam("phoneNumber") String phoneNumber,
        @RequestParam("password") String password) {

        userService.registerUser(username, email, phoneNumber, password);
        return new RedirectView("/login"); // Chuyển hướng đến trang đăng nhập sau khi đăng ký
    }
}

