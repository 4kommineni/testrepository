package com.spring.hibernatestest.viewModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Registration {

	@Size(max = 45)
	private String first_name;

	@Size(max = 45)
	private String last_name;

	@Size(min = 3, max = 45)
	@Email
	private String email;

	@Size(min = 6, max = 45)
	private String password;

	@Size(min = 6, max = 45)
	private String confirm_password;

	private String mobile;
	private String address;

	public Registration() {
		super();
	}

	public Registration(String first_name, String last_name, String email, String password, String confirm_password,
			String mobile, String address) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
		this.mobile = mobile;
		this.address = address;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	
	
	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Registration [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", password=" + password + ", confirm_password=" + confirm_password + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

}
