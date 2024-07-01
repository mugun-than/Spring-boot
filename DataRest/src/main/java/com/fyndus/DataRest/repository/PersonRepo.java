package com.fyndus.DataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fyndus.DataRest.entity.Person;

@RepositoryRestResource(collectionResourceRel = "persons", path="persons")
public interface PersonRepo extends JpaRepository<Person, Long>{

}
