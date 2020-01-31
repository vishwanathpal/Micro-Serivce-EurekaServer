package com.micro.pathology.model;

public class Disease {

	private String id;
	private String discreption;
	private String treatment;

	public Disease(String id, String discreption, String treatment) {
		this.id = id;
		this.discreption = discreption;
		this.treatment = treatment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiscreption() {
		return discreption;
	}

	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
}
