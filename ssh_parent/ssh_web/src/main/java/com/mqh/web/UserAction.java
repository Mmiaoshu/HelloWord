package com.mqh.web;

import com.mqh.entity.User;
import com.mqh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends  ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private UserService userService ;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void login() {
		// 调用dao里面的方法
		//return userDao.loginUser(user);
		System.out.println("过来了！！！！！！！！！！");
		User  user = userService.findUser();
		
		System.out.println("login结束。。。。。。。。。。。。。");
	}
	
	

}
