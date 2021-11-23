package service;

import java.util.List;

import dao.PersonsDao;
import model.Persons;

public class PersonServiceImpl implements PersonsService{
	

	public List<Persons> getAllPersons() {
		// TODO Auto-generated method stub
		return PersonsDao.getPersonsData();
	}

	@Override
	public String insertPerson(Persons person) {
		// TODO Auto-generated method stub
		return PersonsDao.insertPersonData(person);
	}

}
