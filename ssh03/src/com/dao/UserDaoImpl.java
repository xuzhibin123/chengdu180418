package com.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.entity.User;

//底层使用sessionFactory,自动注入模板HibernateTemplate
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}
	public void del(Serializable id) {
		this.getHibernateTemplate().delete(findbyid(id));
	}

	public User findbyid(Serializable id) {
		return this.getHibernateTemplate().get(User.class, id);
	}

	public List<User> findall() {
		return (List<User>) this.getHibernateTemplate().find("from User", null);
	}


}
