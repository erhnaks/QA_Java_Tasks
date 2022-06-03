package com.qa.JDBC_Demo;

import java.io.PrintStream;
import java.util.List;

import com.qa.CustDAO.CustDAO;
import com.qa.JDBC_Demo.*;

public class Runner {

	public static void main(String[] args) {

		CustDAO custDAO = new CustDAO();

		Customer customer = custDAO.findById(1);

		System.out.println(customer);

		Customer newCust = new Customer();

		newCust.setFirstname("Erhan");
		newCust.setLastname("Aksu");

		custDAO.create(newCust);

	}
}
