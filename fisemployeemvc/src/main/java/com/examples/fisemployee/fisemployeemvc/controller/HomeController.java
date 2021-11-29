package com.examples.fisemployee.fisemployeemvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.fisemployee.fisemployeemvc.model.Fisemployee;
import com.examples.fisemployee.fisemployeemvc.service.FisemployeeService;
import com.examples.fisemployee.fisemployeemvc.service.FisemployeeServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	FisemployeeServiceImpl service;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/showinsertemployee")
	public String test() throws IOException{
		return "insertEmp";
	}
	
	@RequestMapping(value="/calInsert")
	public String insertEmpData(@RequestParam("empid")int empid, @RequestParam("name") String name,
			@RequestParam("department") String department, @RequestParam("designation")String designation) {
		
		// @RequestMapping(value="/calInsert")
		// public String insertEmpData(@ModelAttribute("userForm") Fisemployee fis);
		
		Fisemployee fis = new Fisemployee(empid,name,department,designation);
		
		boolean temp = service.insertFisEmployee(fis);
		if(temp)
			return "home";
		else
			return "fail";
		
		
	}
	
	@RequestMapping(value="/showAllemployees")
	public ModelAndView test1() throws IOException{
		List<Fisemployee> emps = service.getAllFisEmployees();
		return new ModelAndView("showEmp","fisdata", emps);
	}
	
	
	@RequestMapping(value="/searchemployees")
	public String sendEmployeeSearchForm() throws IOException{
		
		return "searchempform";
	}
	
	@RequestMapping(value="/searchEmp")
	public ModelAndView searchEmp(@RequestParam("empid") String empid) throws IOException{
		int eid = Integer.parseInt(empid);
		Fisemployee emp = service.searchFisEmployee(eid);
		System.out.println(emp.getName());
		return new ModelAndView("displayemp","data",emp);
	}
}
