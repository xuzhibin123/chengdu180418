package com.action;

import java.util.List;

import com.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserAction extends ActionSupport{
	private User user;//封装表单数据
	private UserService userService;//注入的service层对象
	private List<User> userlist;
	
	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String saveUser(){
		String pwd = user.getPassword();
		//md5加密pwd对象
		
		this.userService.addUser(user);
		this.userlist = this.userService.findUser();
		return SUCCESS;
	}
}
