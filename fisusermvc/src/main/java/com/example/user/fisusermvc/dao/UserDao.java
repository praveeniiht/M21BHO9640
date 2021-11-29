package com.example.user.fisusermvc.dao;

import java.util.List;

import com.example.user.fisusermvc.model.User;

public interface UserDao {
	
	public String insertUser(User user);
	public String deleteUser(String uname);
	public String searchUser(String uname);
	public List<User> getAllUsers();

}
