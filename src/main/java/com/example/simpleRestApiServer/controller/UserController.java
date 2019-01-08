package com.example.simpleRestApiServer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleRestApiServer.model.*;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getUser() {
		
		List<User> users = new ArrayList<User>();
		
		users.add(new User("firstName1", "lastName1"));
		users.add(new User("firstName2", "lastName2"));
		users.add(new User("firstName3", "lastName3"));
		users.add(new User("firstName4", "lastName4"));
		
		return users;
	}
}