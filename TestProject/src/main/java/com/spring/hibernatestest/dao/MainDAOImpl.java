package com.spring.hibernatestest.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.hibernatestest.model.Students;

public class MainDAOImpl implements MainDAO {
	
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Students> getAllStudents() {
		List<Students> allStudents = new ArrayList<Students>();
		
		Session session = sessionFactory.openSession();
		List result= session.createQuery("FROM Students").list(); // HQL -
		for (Iterator iterator = result.iterator(); iterator.hasNext();)
        {
            allStudents.add((Students) iterator.next());            
        }  
		return allStudents;
	}

}
