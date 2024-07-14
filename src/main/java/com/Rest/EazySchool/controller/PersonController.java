package com.Rest.EazySchool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.EazySchool.dao.Person;
import com.Rest.EazySchool.service.PersonService;


@RestController
@RequestMapping("/public")
public class PersonController {
	
	@Autowired
	private PersonService personServ;
	
	@PostMapping("/CreateUser")
	public Person CreatePerson(@RequestBody Person person) {
		return personServ.CreatePerson(person);
	}
	
	@GetMapping("/getAllUser")
	public List<Person> GetAllUser(){
		return personServ.getAllusers();
	}

}
