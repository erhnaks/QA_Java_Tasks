package com.qa.CustDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qa.JDBC_Demo.Customer;
import com.qa.JDBC_Demo.JDBCUtility;

public class CustDAO {

	public List<Customer> findAll() {

		try (Connection conn = JDBCUtility.getConnection(); Statement stmt = conn.createStatement();) {

			String SQL = "SELECT * FROM customer";
			ResultSet rs = stmt.executeQuery(SQL);

			List<Customer> customers = new ArrayList<>();

			while (rs.next()) {
				Customer customer = this.unwrap(rs);
				customers.add(customer);

			}
			return customers;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Customer findById(long id) {
		try (Connection conn = JDBCUtility.getConnection(); Statement stmt = conn.createStatement();) {
			String SQL = "SELECT * FROM customer WHERE id = " + id;

			ResultSet rs = stmt.executeQuery(SQL);

			if (rs.next()) {

				Customer customer = this.unwrap(rs);
				return customer;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void create(Customer customer) {

		String SQL = "INSERT INTO customer (firstname, surname) VALUES (?,?)";

		try (Connection conn = JDBCUtility.getConnection(); PreparedStatement ps = conn.prepareStatement(SQL);) {

			ps.setString(1, customer.getFirstname());
			ps.setString(2, customer.getLastname());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Customer unwrap(ResultSet rs) throws SQLException {

		Customer customer = new Customer();

		Long id = rs.getLong("id");
		String firstname = rs.getString("firstname");
		String lastname = rs.getString("lastname");

		customer.setId(id);
		customer.setFirstname(firstname);
		customer.setLastname(lastname);

		return customer;
	}
}
