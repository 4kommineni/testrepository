package com.spring.hibernatestest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.spring.hibernatestest.viewModel.Login;

public class LoginDAOImpl implements LoginDAO{

	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean verifyUser(Login login) {
		
		sessionFactory.openSession();
		Session session = sessionFactory.getCurrentSession();
		
		Query query=session.createQuery("from User where username='"+login.getEmail()+"' and password='"+login.getPassword()+"'");		
		List results = query.list();
		return (results.size()>0);
	}
	
	
}
