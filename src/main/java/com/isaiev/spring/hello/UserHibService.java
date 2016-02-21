package com.isaiev.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userHibService")
@Transactional
public class UserHibService {
	
	@Autowired
	private UserHibDao userDao;
	
	public UserEntity addUser(UserEntity user){
		userDao.addUser(user);
		System.out.println("User has been added "+user);
		return user;
	}
	public UserEntity getUserById(int id){
		return userDao.getUserById(id);
	}
	public void saveUser(UserEntity user){
		userDao.saveUser(user);
		System.out.println("User has been saved "+user);
	}

}
