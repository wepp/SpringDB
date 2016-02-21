package com.isaiev.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void createUser(User user){
		if(user==null) return;
		userDao.addUser(user);
		System.out.println("User have been saved "+user);
	}
	
	public User getUserById(int id){
		return userDao.getUserById(id);
	}
}
