package com.example.user.fisusermvc.service;

import java.util.List;

import com.example.user.fisusermvc.dao.UserDaoImpl;
import com.example.user.fisusermvc.model.User;

public class UserServiceImpl  implements UserService{
	
	UserDaoImpl repo;
	

	public UserDaoImpl getRepo() {
		return repo;
	}

	public void setRepo(UserDaoImpl repo) {
		this.repo = repo;
	}

	@Override
	public String insertUser(User user) {
		// TODO Auto-generated method stub
		return repo.insertUser(user);
	}

	@Override
	public String deleteUser(String uname) {
		// TODO Auto-generated method stub
		return repo.deleteUser(uname);
	}

	@Override
	public String searchUser(String uname) {
		// TODO Auto-generated method stub
		return repo.searchUser(uname);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.getAllUsers();
	}

}
