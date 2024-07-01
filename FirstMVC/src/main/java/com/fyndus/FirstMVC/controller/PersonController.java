package com.fyndus.FirstMVC.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fyndus.FirstMVC.entity.Person;
import com.fyndus.FirstMVC.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired 
	private PersonService service;
	
	@GetMapping("/person/{id}")
	public String getPerson(@PathVariable("id") int id) {
		return service.fetchPerson(id);
	}
	
	@GetMapping("/persons")
	public List<Person> listPersons() {
		return service.allPersons();
	}

	@PostMapping("/person")
	public Person postPerson(@RequestBody Person person) {
		return service.createPerson(person);
	}
	
	@DeleteMapping("/person/{id}")
	public String deletePerson(@PathVariable("id") int id) {
		return service.removePerson(id);
	}
	
	@PutMapping("/person")
	public Person putPerson(@RequestBody Person person) {
		return service.updatePerson(person);
	}
}