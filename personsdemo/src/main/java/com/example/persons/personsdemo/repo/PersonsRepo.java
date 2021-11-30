package com.example.persons.personsdemo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.persons.personsdemo.model.Persons;


@Repository
@Transactional
public interface PersonsRepo extends JpaRepository<Persons,Integer>{

}
