package com.fyndus.FirstMVC.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String tech;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
}
