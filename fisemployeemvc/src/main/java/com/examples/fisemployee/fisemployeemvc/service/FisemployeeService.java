package com.examples.fisemployee.fisemployeemvc.service;

import java.util.List;

import com.examples.fisemployee.fisemployeemvc.model.Fisemployee;



public interface FisemployeeService {

	public List<Fisemployee> getAllFisEmployees();
	public boolean insertFisEmployee(Fisemployee fisemployee);
	public Fisemployee searchFisEmployee(int empid);
	
}
