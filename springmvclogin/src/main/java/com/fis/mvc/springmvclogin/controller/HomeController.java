package com.fis.mvc.springmvclogin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/validate")
	public String validateUser(HttpServletResponse response, HttpServletRequest request) throws IOException{
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		if(uname.equals("admin") && passwd.equals("1234"))
				return "success";
		else
			return "fail";
	}
}
