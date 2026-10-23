package com.example.demo.model;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee
{ 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
    @Column(name="first_name")
	private String firstname;
    
    @Column(name="lastname")
	private String lastname;
	
	@Column(name="email_id")
	private String emialId;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmialId() {
		return emialId;
	}
	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}
	public Employee(String firstname, String lastname, String emialId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emialId = emialId;
	}
	public Employee()
	{
		
	}
}
