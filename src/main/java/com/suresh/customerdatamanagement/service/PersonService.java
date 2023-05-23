package com.suresh.customerdatamanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.customerdatamanagement.entity.Person;
import com.suresh.customerdatamanagement.repository.PersonDAO;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO dao;
	
	public Person save(Person person)
	{
		return dao.save(person);
	}
	
	public List<Person> getAllPersons()
	{
		return dao.getAllPersons();
	}

}
