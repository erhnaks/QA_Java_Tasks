package com.qa.util;

public class QueryUtil {

	public static String insertCustomerQuery() {
		
		return "INSERT INTO jdbcdb.customer (firstname, lastname, cust_age, address, city) VALUES (?, ?, ?, ?, ?)";
	}
}
