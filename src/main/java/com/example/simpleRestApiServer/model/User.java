package com.example.simpleRestApiServer.model;

import javax.validation.constraints.NotBlank;

public class User {
	
	//Just for simple api for now
	public User(@NotBlank String firstName, @NotBlank String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
