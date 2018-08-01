package com.dao;

import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository
public interface UserDao {

	public void save(User user);
}
