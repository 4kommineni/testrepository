package com.spring.hibernatestest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernatestest.dao.RegDAO;
import com.spring.hibernatestest.viewModel.Registration;

@Service
public class RegServiceImpl implements RegService {

	@Autowired
	RegDAO regDAO;

	@Transactional
	@Override
	public void addNewUser(Registration reg) {		
		regDAO.addNewUser(reg);
	}
}
