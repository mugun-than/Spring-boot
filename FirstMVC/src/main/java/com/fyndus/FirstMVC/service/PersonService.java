package com.fyndus.FirstMVC.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyndus.FirstMVC.entity.Person;
import com.fyndus.FirstMVC.repository.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;

	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return repo.save(person);
	}

	public String fetchPerson(int id) {
		// TODO Auto-generated method stub
		return repo.findName(id);
	}

	public List<Person> allPersons() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public String removePerson(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return id+" Deleted";
	}

	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return repo.save(person);
	}

	
}
