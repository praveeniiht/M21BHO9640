package com.example.user.fisusermvc.service;
import java.util.*;

import com.example.user.fisusermvc.model.User;

public interface UserService {
	
	public String insertUser(User user);
	public String deleteUser(String uname);
	public String searchUser(String uname);
	public List<User> getAllUsers();

}
