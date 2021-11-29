package com.examples.fisemployee.fisemployeemvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.examples.fisemployee.fisemployeemvc.dao.FisemployeeDao;
import com.examples.fisemployee.fisemployeemvc.dao.FisemployeeDaoImpl;
import com.examples.fisemployee.fisemployeemvc.model.Fisemployee;



public class FisemployeeServiceImpl implements FisemployeeService{


	FisemployeeDaoImpl repo;
	
	
	public FisemployeeDao getRepo() {
		return repo;
	}

	public void setRepo(FisemployeeDaoImpl repo) {
		this.repo = repo;
	}

	@Override
	public List<Fisemployee> getAllFisEmployees() {
		// TODO Auto-generated method stub
		return repo.getAllFisEmployees();
	}

	@Override
	public boolean insertFisEmployee(Fisemployee fisemployee) {
		// TODO Auto-generated method stub
		return repo.insertFisEmployee(fisemployee);
	}

	@Override
	public Fisemployee searchFisEmployee(int empid) {
		// TODO Auto-generated method stub
		return repo.searchFisEmployee(empid);
	}

}
