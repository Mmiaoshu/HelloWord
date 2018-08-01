package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

@Service("us")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);
	}

}
