package com.example.demo.rest.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.rest.model.Person;

public interface PersonService {
	
		Person saveperson(Person person);
		
		List<Person> getallpersons();
		
		Person getpersonbyid(long id);
		
		Person updateperson(Person person,long id);
		
		void deletpersonbyid(long id);
}
