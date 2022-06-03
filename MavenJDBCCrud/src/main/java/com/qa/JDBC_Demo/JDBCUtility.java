package com.qa.JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {

	private String connectionURL;
	private String username;
	private String password;

	private JDBCUtility(String connectionURL, String username, String password) {

		super();
		this.connectionURL = connectionURL;
		this.username = username;
		this.password = password;

	}

	private static JDBCUtility utils;

	public static Connection getConnection() throws SQLException {
		if (JDBCUtility.utils == null) {
			JDBCUtility.utils = new JDBCUtility("jdbc:mysql://localhost:3306/namedb", "root", "root");
		}

		return DriverManager.getConnection(JDBCUtility.utils.connectionURL, JDBCUtility.utils.username,
				JDBCUtility.utils.password);

	}

	public static Connection getConnection(String connectionUrl, String username, String password) throws SQLException {
		return DriverManager.getConnection(connectionUrl, username, password);
	}

}
