package com.isaiev.spring.hello;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUserDao implements UserDao{
	
	private static final String SQL_INSERT_USER = "insert into user (login,password,role) values (?,?,?)";
	private static final String SQL_SELECT_USER_BY_ID = "select id, login, password, role from user where id = ?";


	@Autowired
	private SimpleJdbcTemplate jdbcTemplate;


	public void addUser(User user) {
		jdbcTemplate.update(SQL_INSERT_USER, 
				user.getLogin(),
				user.getPassword(),
				user.getRole());
	}


	public User getUserById(int id) {
		return jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_ID, 
				new ParameterizedRowMapper<User>() {
				public User mapRow(ResultSet rs, int rowNum) throws SQLException{
				User user = new User();
				user.setId(rs.getInt(1));
				user.setLogin(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setRole(rs.getString(4));
				return user;
				}
				},id);
	}

}
