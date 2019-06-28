package com.spring.hibernatestest.dao;

import com.spring.hibernatestest.viewModel.Login;

public interface LoginDAO {
	public boolean verifyUser(Login login);
}
