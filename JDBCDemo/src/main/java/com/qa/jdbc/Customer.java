package com.qa.jdbc;

public class Customer {

	private int id;
	private String firstname;
	private String lastname;
	private int cust_age;
	private String address;
	private String city;

	public Customer(String firstname, String lastname, int cust_age, String address, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.cust_age = cust_age;
		this.address = address;
		this.city = city;
	}
	
	
	

	public Customer(int id, String firstname, String lastname, int cust_age, String address, String city) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cust_age = cust_age;
		this.address = address;
		this.city = city;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getCust_age() {
		return cust_age;
	}

	public void setCust_age(int cust_age) {
		this.cust_age = cust_age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
