package com.examples.fisemployee.fisemployeemvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.fisemployee.fisemployeemvc.model.Fisemployee;
import com.examples.fisemployee.fisemployeemvc.model.FisemployeeRowMapper;

public class FisemployeeDaoImpl implements FisemployeeDao {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Fisemployee> getAllFisEmployees() {
		// TODO Auto-generated method stub
		String sql = "select * from fisemployee";

		return template.query(sql, new FisemployeeRowMapper());
	}

	@Override
	public boolean insertFisEmployee(Fisemployee fisemployee) {
		// TODO Auto-generated method stub
		String sql = "insert into fisemployee values (?,?,?,?)";
		int k = template.update(sql, fisemployee.getEmpid(), fisemployee.getName(), fisemployee.getDepartment(),
				fisemployee.getDesignation());
		if (k == 1)
			return true;
		else
			return false;

	}

	@Override
	public Fisemployee searchFisEmployee(int empid) {
		Fisemployee temp=null;
		// TODO Auto-generated method stub
		String sql = "select * from fisemployee";

		List<Fisemployee> data = template.query(sql, new FisemployeeRowMapper());
		for(Fisemployee emp:data) {
			if(emp.getEmpid()==empid) {
				temp=emp;
				break;
			}
		}
		return temp;
	}

}
