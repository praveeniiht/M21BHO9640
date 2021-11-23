package test;

public class Employee {
	String ename;
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
