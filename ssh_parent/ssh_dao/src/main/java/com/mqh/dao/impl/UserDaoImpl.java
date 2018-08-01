package com.mqh.dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.mqh.dao.UserDao;
import com.mqh.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	@Override
	public User findUser() {
		
		System.out.println("UserDaoImpl............................");
		User  user = this.getHibernateTemplate().get(User.class, 1);
		System.out.println(user.toString());
		System.out.println(user.getAddress()+":"
					+user.getUsername()+":"+user.getPassword());
		
		return null;
	}

	@Override
	public User findUserById() {
		
		Session session =  this.getSessionFactory().openSession();
		
		return null;
	}

}
