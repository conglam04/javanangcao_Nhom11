package com.example.travel_suggestion.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.travel_suggestion.entity.User;
import com.example.travel_suggestion.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{

	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public void registerUser(String username, String email, String phoneNumber, String password) {
	        User user = new User();
	        user.setUsername(username);
	        user.setEmail(email);
	        user.setPhoneNumber(phoneNumber);
	        user.setPassword(password); // Không mã hóa nếu bạn không dùng mật khẩu mã hóa
	        userRepository.save(user);
	    }
	    
	    public Optional<User> findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }

	    public Optional<User> findByEmail(String email) {
	        return userRepository.findByEmail(email);
	    }

	    public Optional<User> findByPhoneNumber(String phoneNumber) {
	        return userRepository.findByPhoneNumber(phoneNumber);
	    }

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

}
