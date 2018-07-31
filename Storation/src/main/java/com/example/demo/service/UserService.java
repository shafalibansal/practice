package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void saveData(User user){
		userRepo.save(user);
	}
	
	public Optional<User> getById(Long id) {
        return userRepo.findById(id);
}
	
}
