
package com.service;

import java.util.List;

import com.dao.UserDao;
import com.entity.User;
import com.utils.MD5;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void addUser(User user) {
		//md5加密存储到数据库 
		String md5str = MD5.encrypty(user.getPassword());
		user.setPassword(md5str);
		this.userDao.save(user);//服务层代码调用数据访问层
	}
	public List<User> findUser() {
		return this.userDao.findall();
	}
	
}
