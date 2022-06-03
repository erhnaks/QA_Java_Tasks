package com.qa.Jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Customer {

	public static void main(String[] args) {

		String jdbcURL = "jdbc:mysql://localhost:3306/namedb";
		String dbusername = "root";
		String dbpassword = "root";
		
		
		String firstname = "Arzu";
		String lastname = "Aksu";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);

			// This line checks the connection!
//		 if (connection != null) { 								
//			System.out.println("Connected to the database!"); 

			String sql = "INSERT INTO customer (firstname, lastname)" + "VALUES(?, ?)"; //Dynamic Entry!

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString( 1, firstname);
			statement.setString( 2, lastname);
			
			int rows = statement.executeUpdate();
			if (rows > 0) {
				System.out.println("A new customer has been added!");
			}

			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
