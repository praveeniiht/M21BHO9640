package com.examples.fisemployee.fisemployeemvc.dao;

import java.util.List;

import com.examples.fisemployee.fisemployeemvc.model.Fisemployee;

public interface FisemployeeDao {
	public List<Fisemployee> getAllFisEmployees();
	public boolean insertFisEmployee(Fisemployee fisemployee);
	public Fisemployee searchFisEmployee(int empid);
}
