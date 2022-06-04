package com.qa.util;

public class QueryUtil {

	public static String insertCustomerQuery() {

		return "INSERT INTO jdbcdb.customer (firstname, lastname, cust_age, address, city) VALUES (?, ?, ?, ?, ?)";
	}

	public static String selectAllCustomerQuery() {
		return "SELECT * FROM jdbcdb.customer";
	}
	
	public static String selectCustomerById(int id) {
		return "SELECT * FROM customer WHERE id= " + id;
	}

	public static String deleteCustomerByid(int id) {
		return "DELETE FROM customer WHERE id=" + id;
	}

}

