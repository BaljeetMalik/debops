package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.model.User;
import com.test.rest.repo.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/all")
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@GetMapping("/user/{name}")
	public User findAll(@PathVariable String name) {
		return userRepository.findAll().stream().filter(u -> u.getFirstName().contains(name)).findFirst().get();
	}

}
