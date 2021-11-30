package com.example.persons.personsdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.persons.personsdemo.model.Persons;



public interface PersonsService {
	
	public List<Persons> getAllPersons();

}
