package com.test.rest.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.rest.model.User;

@Service
public class UserRepository {

	public List<User> findAll() {

		User user1 = new User("Rajiv", "Singh", 20);
		User user2 = new User("Rakesh", "Soni", 30);
		User user3 = new User("Rahul", "Dahiya", 40);
		User user4 = new User("Loki", "Kumar", 50);

		return Arrays.asList(user1, user2, user3, user4);

	}

}
