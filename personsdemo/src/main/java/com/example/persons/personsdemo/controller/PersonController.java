package com.example.persons.personsdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persons.personsdemo.model.Persons;
import com.example.persons.personsdemo.service.PersonsService;

@RestController
public class PersonController {

	@Autowired
	PersonsService service;

	@GetMapping("/all")
	public List<Persons> getAll() {
		return service.getAllPersons();
	}

	@PostMapping("/add")
	public String addPerson(@RequestBody Persons person) {

		return service.insertPerson(person);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deletePerson(@PathVariable Integer pid) {
		
		return service.deletePerson(pid);
		
	}
	
	@GetMapping("/find/{pid}")
	public Optional<Persons> findPerson(@PathVariable Integer pid) {
		
		return service.searchById(pid);
		
	}

}
