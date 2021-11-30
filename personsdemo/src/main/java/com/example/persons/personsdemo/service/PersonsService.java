package com.example.persons.personsdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.persons.personsdemo.model.Persons;



public interface PersonsService {
	
	public List<Persons> getAllPersons();
	public String insertPerson(Persons person);
	public String deletePerson(int pid);
	public Optional<Persons> searchById(int pid);

}
