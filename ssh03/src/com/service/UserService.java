package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {
	public void addUser(User user);
	public List<User> findUser();
}
