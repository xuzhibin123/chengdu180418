package com.dao;

import java.io.Serializable;
import java.util.List;

import com.entity.User;

public interface UserDao {
	public void save(User user);
	public void update(User user);
	public void del(Serializable id);
	public User findbyid(Serializable id);
	public List<User> findall();
}
