package com.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.entity.User;

public class UserDAO {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public List<User> find(){
		String hql = "from User";
		return getSession().createQuery(hql).list();
	}

}
