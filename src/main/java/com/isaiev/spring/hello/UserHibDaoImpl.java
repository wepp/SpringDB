package com.isaiev.spring.hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserHibDaoImpl implements UserHibDao{

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	public void addUser(UserEntity user) {
		currentSession().save(user);
	}
	public UserEntity getUserById(int id) {
		return (UserEntity) currentSession().get(UserEntity.class, id);
	}
	public void saveUser(UserEntity user) {
		currentSession().update(user);
	}


}
