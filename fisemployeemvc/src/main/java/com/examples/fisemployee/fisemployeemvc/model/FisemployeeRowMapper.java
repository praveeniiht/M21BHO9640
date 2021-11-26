package com.examples.fisemployee.fisemployeemvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FisemployeeRowMapper implements RowMapper<Fisemployee>{

	@Override
	public Fisemployee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Fisemployee fis = new Fisemployee();
		fis.setEmpid(rs.getInt(1));
		fis.setName(rs.getString(2));
		fis.setDepartment(rs.getString(3));
		fis.setDesignation(rs.getString(4));
		return fis;
	}

}
