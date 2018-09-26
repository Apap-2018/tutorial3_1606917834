package com.apap.tutorial3.model;

public class PilotModel {
	private String Id;
	private String licenseNumber;
	private String name;
	private Integer flyHour;
	
	public PilotModel(String id, String licenseNumber, String name, Integer flyHour) {
		super();
		Id = id;
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.flyHour = flyHour;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFlyHour() {
		return flyHour;
	}

	public void setFlyHour(Integer flyHour) {
		this.flyHour = flyHour;
	}
	
	
}
