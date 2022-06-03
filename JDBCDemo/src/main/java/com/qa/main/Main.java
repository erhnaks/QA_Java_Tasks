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
					System.out.println("Enter a name, lastname, age, address and the city");
					databaseservice.insertCustomer(new Customer(scanner.nextLine(), scanner.nextLine(),
							Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine()));
					break;
				case 2:
					System.out.println(choice);
					break;
				case 3:
					System.out.println(choice);
					break;
				case 4:
					System.out.println(choice);
					break;
				case 5:
					System.out.println(choice);
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