package com.examples.spring;

public class Student {
	String name;
	String branch;
	Address address;
	
	
	public Student(String name, String branch, Address address) {
		super();
		this.name = name;
		this.branch = branch;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
