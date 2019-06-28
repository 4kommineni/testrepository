package com.spring.hibernatestest.viewModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Login {

	@Email
	@Size(min = 3, max = 45)
	private String email;

	@Size(min = 6, max = 45)
	private String password;

	public Login() {
		super();
	}

	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}

}
