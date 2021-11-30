package com.example.persons.personsdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Persons {
	
	@Id
	int pid;
	
	@Column
	String name;
	
	@Column
	String city;
	
	@Column
	String state;
	
	
	public Persons() {
		
	}
	public Persons(int pid, String name, String city, String state) {
		super();
		this.pid = pid;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
