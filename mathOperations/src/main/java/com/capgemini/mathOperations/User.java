package com.capgemini.mathOperations;

import com.google.common.base.Preconditions;

public class User {

	private Long id;
	private String firstName;
	private String lastName;
	String login;

	public User(){
		
	}

	public User(Long id, String firstName, String lastName, String login) {
		this.id = Preconditions.checkNotNull(id);
		this.firstName = Preconditions.checkNotNull(firstName);
		this.lastName = Preconditions.checkNotNull(lastName);
		this.login = Preconditions.checkNotNull(login);

		Preconditions.checkArgument(firstName.length() > 0);
		Preconditions.checkArgument(lastName.length() > 0);
		Preconditions.checkArgument(login.length() > 0);
	}
}
