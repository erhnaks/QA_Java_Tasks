package com.qa.JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerManager {

	public static void main(String[] args) {

		String jdbcURL = "jdbc:mysql://localhost:3306/namedb";
		String username = "root";
		String password = "root";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			if (connection != null) {
				System.out.println("Connected to the database!");
				connection.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
