package com.isaiev.spring.hello;

public interface UserDao {
	void addUser(User student);
	User getUserById(int id);
}
