package com.example.persons.personsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persons.personsdemo.model.Persons;
import com.example.persons.personsdemo.service.PersonsService;

@RestController
public class PersonController {
	
	@Autowired
	PersonsService service;
	
	@GetMapping("/all")
	public List<Persons> getAll(){
		return service.getAllPersons();
	}

}
