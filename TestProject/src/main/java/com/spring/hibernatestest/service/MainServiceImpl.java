package com.spring.hibernatestest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernatestest.dao.MainDAO;
import com.spring.hibernatestest.model.Students;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	MainDAO mainDAO;
	
	
	@Transactional
	@Override
	public List<Students> getAllStudents() {
		return mainDAO.getAllStudents();
		
	}

}
