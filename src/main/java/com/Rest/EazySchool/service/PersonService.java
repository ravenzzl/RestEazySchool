package com.Rest.EazySchool.service;

import java.util.List;
import java.util.Optional;

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
		return  personRepo.findAll();
	}

	public Person getUserByID(int id) {
		return personRepo.findById(id).get();
	}

	public String deleteUserById(int id) {
	    Person person=personRepo.findById(id).get();
		personRepo.deleteById(id);
		return person.getName()+" got delete from db";
	}

	public Person updateUserById(int id, Person person) {
		Optional<Person> UpdatePerson=personRepo.findById(id);
		if(UpdatePerson.isPresent()) {
			Person updatePerson=UpdatePerson.get();
			if(person.getName()!=null) {
				updatePerson.setName(person.getName());				
			}
			if(person.getEmail()!=null) {
				updatePerson.setEmail(person.getEmail());				
			}
			if(person.getMobileNumber()!=null) {
				updatePerson.setMobileNumber(person.getMobileNumber());				
			}
			if(person.getPassword()!=null) {
				updatePerson.setPassword(person.getPassword());				
			}
			return personRepo.save(updatePerson);
		}
		return null;
	}

}










