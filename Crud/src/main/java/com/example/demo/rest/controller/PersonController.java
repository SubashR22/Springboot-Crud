package com.example.demo.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.model.Person;
import com.example.demo.rest.service.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	
		private PersonService personservice;

		public PersonController(PersonService personservice) {
			super();
			this.personservice = personservice;
		}
		
		@PostMapping
		public ResponseEntity<Person> saveperson(@RequestBody Person person){
				
			return new ResponseEntity<Person>(personservice.saveperson(person),HttpStatus.CREATED);
		}
		@GetMapping
		public List<Person> getallpersons(){
			return personservice.getallpersons();
		}
		@GetMapping("{id}")
		public ResponseEntity<Person> getpersonbyid(@PathVariable("id")long id){
			return new ResponseEntity<Person>(personservice.getpersonbyid(id),HttpStatus.OK);
		}
		@PutMapping("{id}")
		public ResponseEntity<Person>updateperson(@PathVariable("id")long id,@RequestBody Person person){
			return new ResponseEntity<Person>(personservice.updateperson(person, id),HttpStatus.OK);
		}
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String>deletpersonbyid(@PathVariable("id")long id){
			personservice.deletpersonbyid(id);
			return new ResponseEntity<>("Deleted Sucessfully",HttpStatus.OK);
		}
}
