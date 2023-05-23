package com.suresh.customerdatamanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.customerdatamanagement.entity.Person;
import com.suresh.customerdatamanagement.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person)
	{
		return service.save(person);
		
	}
	
	@GetMapping("/all-persons")
	public @ResponseBody List<Person> getAllPersons()
	{
		return service.getAllPersons();
	}
	
	//getAll
	//getbyPersonName

}