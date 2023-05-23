package com.suresh.customerdatamanagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suresh.customerdatamanagement.entity.Person;

@Repository
public class PersonDAO {

	@Autowired
	private PersonRepository repository;

	public Person save(Person person) {

		return repository.save(person);
	}

	public List<Person> getAllPersons()
	{
		return repository.findAll();
	}
	
}
