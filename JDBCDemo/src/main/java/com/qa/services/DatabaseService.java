package com.qa.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qa.jdbc.Customer;
import com.qa.util.DatabaseUtil;
import com.qa.util.QueryUtil;

public class DatabaseService {

	DatabaseUtil databaseUtil = new DatabaseUtil();

	public void insertCustomer(Customer customer) throws SQLException {

		try (Connection connection = databaseUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.insertCustomerQuery());) {
			preparedStatement.setString(1, customer.getFirstname());
			preparedStatement.setString(2, customer.getLastname());
			preparedStatement.setLong(3, customer.getCust_age());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setString(5, customer.getCity());

			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				System.out.println("Customer added successfully.");
			} else {
				System.out.println("Adding customer failed!!!");
			}
		}

	}// End of adding customer to the database insert customer method;
}