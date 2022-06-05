package com.qa.main;

import java.util.Scanner;

import com.qa.jdbc.Customer;
import com.qa.services.DatabaseService;

public class Main {

	public static void main(String[] args) {

		DatabaseService databaseservice = new DatabaseService();

		try (Scanner scanner = new Scanner(System.in);) {

			boolean isRunning = true;
			while (isRunning) {

				System.out.println("Please enter an operation");
				System.out.println("1. Add a customer to customer database");
				System.out.println("2. Select all customers from customer database");
				System.out.println("3. Select customer by customer id from the customer database");
				System.out.println("4. Delete a customer from the customer database");
				System.out.println("5. Update an existing customer from the customer database");
				System.out.println("6. Exit");

				int choice = Integer.parseInt(scanner.nextLine());

				switch (choice) {
				case 1:
					System.out.println("Enter a name, lastname, age, address and the city: ");
					databaseservice.insertCustomer(new Customer(scanner.nextLine(), scanner.nextLine(),
							Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine()));
					break;
				case 2:
					databaseservice.getAllCustomer();
					break;
				case 3:
					System.out.println("Enter id of a customer: ");
					databaseservice.getCustomerById(Integer.parseInt(scanner.nextLine()));
					break;
				case 4:
					System.out.println("Enter id of a customer you wished to delete: ");
					databaseservice.deleteCustomerById(Integer.parseInt(scanner.nextLine()));
					break;
				case 5:
					System.out.println("Enter id of a customer: ");
					int updateID = Integer.parseInt(scanner.nextLine());
					boolean isFound = databaseservice.getCustomerById(updateID);

					if (isFound) {
						System.out.println("Enter name, lastname, cust_age, address, city : ");
						Customer customer = new Customer(updateID, scanner.nextLine(), scanner.nextLine(),
								Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine());
						databaseservice.updateCustomer(customer);
					}

					break;
				case 6:
					System.out.println("Thank you for using this service! Exiting...");
					isRunning = false;

					break;

				default:
					System.out.println("There has been an error, please refresh this page!");
					break;
				}

			}
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong " + e);
		}

	}
}