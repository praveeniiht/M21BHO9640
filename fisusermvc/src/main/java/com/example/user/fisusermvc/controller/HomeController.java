package com.example.user.fisusermvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.user.fisusermvc.model.User;
import com.example.user.fisusermvc.service.UserService;
import com.example.user.fisusermvc.service.UserServiceImpl;

@Controller
public class HomeController {

	@Autowired
	UserServiceImpl service;

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/validate")
	public String validate(@RequestParam("uname") String uname, @RequestParam("passwd") String passwd)
			throws IOException {
		boolean isValid = false;
		String viewName = null;
		if (uname.equals("admin") && passwd.equals("1234"))
			viewName = "admin";

		else {
			List<User> users = service.getAllUsers();
			for (User u : users) {
				if (u.getUsername().equals(uname) && u.getPassword().equals(passwd)) {
					isValid = true;
					break;
				}
			}
			if (isValid && uname != "admin") {
				viewName = "user";
			}
		}
		return viewName;
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(HttpServletResponse response) throws IOException {
		return new ModelAndView("registerpage");
	}

	@RequestMapping(value = "/registerUser")
	public String registerUser(@RequestParam("uname") String uname, @RequestParam("passwd") String passwd)
			throws IOException {

		User user = new User(uname, passwd);
		String result = service.insertUser(user);
		if (result.equals("Registration success"))
			return "admin";
		else
			return "home";
	}

}
