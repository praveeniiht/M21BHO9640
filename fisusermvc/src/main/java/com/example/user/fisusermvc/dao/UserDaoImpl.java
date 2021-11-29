package com.example.user.fisusermvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.user.fisusermvc.model.User;
import com.example.user.fisusermvc.model.UserRowMapper;

public class UserDaoImpl implements UserDao{
	
	JdbcTemplate template;
	
	

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public String insertUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into users values(?,?)";
		int k = template.update(sql, user.getUsername(), user.getPassword());
		if(k==1)
			return "Registration success";
		else
			return "Registration not success";
	}

	@Override
	public String deleteUser(String uname) {
		// TODO Auto-generated method stub
		String sql = "delete from users where uname =?";
		int k = template.update(sql, uname);
			if(k==1)
			return "User deleted...";
		else
			return "User not deleted...";
	}

	@Override
	public String searchUser(String uname) {
		// TODO Auto-generated method stub
		String sql = "select * from users";
		String tpasswd= null;
		List<User> users = template.query(sql, new UserRowMapper());
		for(User u :users){
			if(u.getUsername().equals(uname)){
				tpasswd=u.getPassword();
				break;
			}
		}
			return tpasswd;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		String sql = "select * from users";
		List<User> users = template.query(sql, new UserRowMapper());
		return users;
	}

}
