package com.isaiev.spring.hello;

public interface UserHibDao {
	void addUser(UserEntity teacher);
	UserEntity getUserById(int id);
	void saveUser(UserEntity teacher);

}
