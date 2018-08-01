package com.mqh.service.impl;

import com.mqh.dao.UserDao;
import com.mqh.entity.User;
import com.mqh.service.UserService;

public class UserServiceImpl implements UserService {
	
	
	private UserDao userDao ;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public User findUser() {
		System.out.println("UserServiceImpl..................");
		User user = userDao.findUser();
		return user;
	}

}
