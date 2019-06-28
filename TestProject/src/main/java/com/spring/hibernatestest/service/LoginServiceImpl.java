package com.spring.hibernatestest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernatestest.dao.LoginDAO;
import com.spring.hibernatestest.viewModel.Login;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO loginDAO;
	
	@Transactional
	@Override
	public boolean verifyUser(Login login) {
		return loginDAO.verifyUser(login);
	}

}
