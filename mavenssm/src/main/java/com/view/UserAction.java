package com.view;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;
import com.common.baseAction.baseAction;
import com.service.UserService;

@Controller
@RequestMapping("/")
public class UserAction extends baseAction {
	
	@Resource(name="us")
	private UserService us ;
	
	//http:127.0.0.1/ssm/userAction_save?name="小敏名"&tel="112223"
	@RequestMapping("userAction_save")
	public void save(User user ,HttpServletResponse response){
		System.out.println(user);
		us.save(user);
		write(response, "sussesss---");
	}
	
	
	//http:127.0.0.1/ssm/userAction_test
	@RequestMapping("userAction_test")
	public void test(User user ,HttpServletResponse response){
		//us.save(user);
		write(response, "sussesss---");
		
	}
	

}
