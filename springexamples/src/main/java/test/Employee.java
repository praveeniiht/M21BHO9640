package test;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	String ename;
	
	@Autowired
	Department dept;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void showData() {
		System.out.println("Name = "+ename+" Dept = "+dept);
	}
	
	
}
