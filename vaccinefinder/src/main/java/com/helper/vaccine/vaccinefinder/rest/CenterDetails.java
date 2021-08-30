package com.helper.vaccine.vaccinefinder.rest;

public class CenterDetails {
	
	
	private String name;
	private String address;
	private String state;
	private String district;
	private String areaCode;
	private String pinCode;
	private String type;
	private String date;
	private int fee;
	private int min_age_limit;
	private String vaccine;
    private String available_capacity;
	
	
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public String getAvailable_capacity() {
		return available_capacity;
	}
	public void setAvailable_capacity(String available_capacity) {
		this.available_capacity = available_capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMin_age_limit() {
		return min_age_limit;
	}
	public void setMin_age_limit(int min_age_limit) {
		this.min_age_limit = min_age_limit;
	}

	

}
