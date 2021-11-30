package com.example.persons.personsdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.persons.personsdemo.model.Persons;
import com.example.persons.personsdemo.repo.PersonsRepo;


@Service
public class PersonsServiceImpl implements PersonsService{
	
	
	@Autowired
	PersonsRepo repo;

	@Override
	public List<Persons> getAllPersons() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public String insertPerson(Persons person) {
		// TODO Auto-generated method stub
		repo.save(person);
		return "Record Inserted";
	}

	@Override
	public String deletePerson(int pid) {
		// TODO Auto-generated method stub
		
		repo.deleteById(pid);
		return "Person record deleted";
	}

	@Override
	public Optional<Persons> searchById(int pid) {
		// TODO Auto-generated method stub
		
		return repo.findById(pid);
		
	}

}
