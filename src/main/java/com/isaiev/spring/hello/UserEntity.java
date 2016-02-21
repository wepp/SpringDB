package com.isaiev.spring.hello;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserEntity {
	
	@Id
	@GeneratedValue
	private int id; 
	
	@Column(name="login")
	private String login;
	     
	@Column(name="password")
	private String password;
	    
	@Column(name="role")
	private String role;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

}
