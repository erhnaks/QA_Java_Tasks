package com.qa.customer;

public class Customer {

	private String name;
	private String surname;
	private String address;
	private int mobileNumber;
	private int dateOfYear;

	public Customer() {
	};

	public Customer(String name, String surname, String address, int mobileNumber, int dateOfYear) {

		this.name = name;
		this.surname = surname;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.dateOfYear = dateOfYear;
		
		System.out.println("New customer has been added!");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getDateOfYear() {
		return dateOfYear;
	}

	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}

}
