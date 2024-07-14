package com.Rest.EazySchool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<Person> GetAllUser() {
		return personServ.getAllusers();
	}

	@GetMapping("/getUserByID/{id}")
	public Person getUserId(@PathVariable int id) {
		return personServ.getUserByID(id);

	}
	
	@DeleteMapping("/DeleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return personServ.deleteUserById(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public Person UpdateUser(@PathVariable int id,@RequestBody Person person) {
		return personServ.updateUserById(id,person);
	}

}





