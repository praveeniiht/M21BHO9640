package com.examples.fisemployee.fisemployeemvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import com.examples.fisemployee.fisemployeemvc.model.Fisemployee;


@Qualifier("example2")
public class FisAnotherClassImpl implements FisemployeeService{

	@Override
	public List<Fisemployee> getAllFisEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertFisEmployee(Fisemployee fisemployee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fisemployee searchFisEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
