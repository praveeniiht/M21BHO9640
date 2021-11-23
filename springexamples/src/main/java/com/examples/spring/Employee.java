package com.examples.spring;

public class Employee {
	String name;
	String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void showData() {
		System.out.println("Name = "+name+" Dept = "+dept);
	}
	
	public void beaninit() {
		System.out.println("Bean initalization is called....");
	}
	
	public void beandestroy() {
		System.out.println("Bean destroy method is called...");
	}
}
