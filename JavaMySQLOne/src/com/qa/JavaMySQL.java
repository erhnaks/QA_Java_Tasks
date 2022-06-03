package com.qa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaMySQL {

	public static void main(String[] args) {
		
		String jdbcConnectionURL = "jdbc:mysql://localhost:3306/namedb";
		String username = "root";
		String password = "root";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcConnectionURL, username, password);
			
			System.out.println("Coonected to Database!");
		} catch (SQLException e) {
			System.out.println("Oops, error!");
			e.printStackTrace();
		}
		
	}

}
