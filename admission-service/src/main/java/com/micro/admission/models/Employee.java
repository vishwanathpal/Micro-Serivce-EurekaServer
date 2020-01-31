package com.micro.admission.models;

public class Employee {
	
	private String Id;
	private String firstname;
	private String lastname;
	private String specility;

	public Employee(String id, String firstname, String lastname, String specility) {
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specility = specility;
	}
	
	public Employee() {
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public String getSpecility() {
		return specility;
	}

	public void setSpecility(String specility) {
		this.specility = specility;
	}
	
}
