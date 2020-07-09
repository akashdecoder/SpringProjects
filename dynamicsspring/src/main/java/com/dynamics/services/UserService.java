package com.dynamics.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.dynamics.model.User;
import com.dynamics.repository.UserRepository;
import java.util.*;
@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userRepository.findAll()) {
			users.add(user);
		}
		return users;
	}
}
