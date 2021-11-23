package service;

import java.util.List;

import model.Persons;

public interface PersonsService {
	public List<Persons> getAllPersons();

	public String insertPerson(Persons person);
}
