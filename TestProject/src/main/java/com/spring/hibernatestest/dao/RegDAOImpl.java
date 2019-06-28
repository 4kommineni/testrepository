package com.spring.hibernatestest.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.hibernatestest.model.User;
import com.spring.hibernatestest.viewModel.Registration;

public class RegDAOImpl implements RegDAO{
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addNewUser(Registration reg) {
		Session session;
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		User newUser=new User(reg.getFirst_name(), reg.getLast_name(), reg.getEmail(), reg.getPassword(), 50);
		
		session.persist(newUser);
	}

}
