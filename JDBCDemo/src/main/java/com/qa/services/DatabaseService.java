package com.qa.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.jdbc.Customer;
import com.qa.util.DatabaseUtil;
import com.qa.util.QueryUtil;

public class DatabaseService {

	DatabaseUtil databaseUtil = new DatabaseUtil();

	// From line 18 to line 36 is to create a customer and insert it into given
	// database;

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

	} // End of adding customer to the database insert customer method;

	// GetAllCustomer method starts from here!;
	public void getAllCustomer() throws SQLException {

		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectAllCustomerQuery());) {

			while (resultSet.next()) {
				printCustomer(new Customer(resultSet.getInt("id"), resultSet.getString("firstname"),
						resultSet.getString("lastname"), resultSet.getInt("cust_age"), resultSet.getString("address"),
						resultSet.getString("city")));
			}
		}
	} // End of get all customer method

	private void printCustomer(Customer customer) {
		System.out.println("Customer id: " + customer.getId());
		System.out.println("Customer name: " + customer.getFirstname());
		System.out.println("Customer lastname: " + customer.getLastname());
		System.out.println("Customer age: " + customer.getCust_age());
		System.out.println("Customer address: " + customer.getAddress());
		System.out.println("Customer city: " + customer.getCity());
		System.out.println("-------------------------------------------------------------");
	} // End of printing all customer details to CLI//

	public boolean getCustomerById(int id) throws SQLException {

		boolean isFound = false;

		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery(QueryUtil.selectCustomerById(id));) {
			if (resultset.next()) {
				isFound = true;

				printCustomer(new Customer(resultset.getInt("id"), resultset.getString("firstname"),
						resultset.getString("lastname"), resultset.getInt("cust_age"), resultset.getString("address"),
						resultset.getString("city")));

			} else
				System.out.println("Customer id record not found!" + id);

		}
		return isFound;
	}// End of getCustomer by ID method//

}
