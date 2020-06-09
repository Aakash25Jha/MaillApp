package com.example.MailApp.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	@NotEmpty
	@Size(min=1,max=100)
	private String name;
	@NotEmpty
	@Size(min=1,max=100)
	@Email
	private String email;
	@NotEmpty
	@Size(min=6,max=18)
	private String password;
	
	public User()
	{}

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
