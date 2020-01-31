package com.micro.admission.models;

public class Patient {
	
	private String id;
	private String name;
	private String nationality;

	public Patient(String id, String name, String nationality) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}

	public Patient() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
