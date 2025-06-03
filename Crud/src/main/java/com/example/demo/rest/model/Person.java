package com.example.demo.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		@Column(name="name",nullable=false)
		private String name;
		@Column(name="place")
		private String place;
		@Column(name="depatment")
		private String dept;
		
		public Person(long id, String name, String place, String dept) {
			this.id = id;
			this.name = name;
			this.place = place;
			this.dept = dept;
		}
		public Person() {
			
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", place=" + place + ", dept=" + dept + "]";
		}
}
