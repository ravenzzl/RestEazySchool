package com.Rest.EazySchool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rest.EazySchool.dao.Person;
import com.Rest.EazySchool.repositry.PersonRepositry;


@Service
public class PersonService {
	
	@Autowired
	private PersonRepositry personRepo;
	
	public Person CreatePerson(Person person) {
		return personRepo.save(person);
	}

	public List<Person> getAllusers() {
		// TODO Auto-generated method stub
		return  personRepo.findAll();
	}

}
