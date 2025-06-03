package com.example.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.rest.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

	
		
		
}
