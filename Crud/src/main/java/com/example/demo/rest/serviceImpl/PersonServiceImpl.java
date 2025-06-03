package com.example.demo.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.rest.exception.ResourceNotFoundException;
import com.example.demo.rest.model.Person;
import com.example.demo.rest.repository.PersonRepository;
import com.example.demo.rest.service.PersonService;

import jakarta.transaction.Transactional;
@Service
public class PersonServiceImpl implements PersonService{
	
		private PersonRepository personrepository;
		
	public PersonServiceImpl(PersonRepository personrepository) {
			super();
			this.personrepository = personrepository;
		}
	@Override
	public Person saveperson(Person person) {
		
		return personrepository.save(person);
	}
	@Override
	public List<Person> getallpersons() {
		// TODO Auto-generated method stub
		return personrepository.findAll();
	}
	
	@Override
	public Person getpersonbyid(long id) {
		
		return personrepository.findById(id).orElse(null);
	}
	@Override
	public Person updateperson(Person person, long id) {
		Person existperson=personrepository.findById(id).orElse(null);
		existperson.setName(person.getName());
		existperson.setPlace(person.getPlace());
		existperson.setDept(person.getDept());
		personrepository.save(existperson);
		return existperson;
		
		
	}
	@Override
	public void  deletpersonbyid(long id) {
		
		 personrepository.findById(id);
	}
	
}
