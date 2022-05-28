package com.qa.customer;

public class Main {

	public static void main(String[] args) {
	
		
		Customer erhan = new Customer("Erhan", "Aksu", "London", 0555444356, 1988); 
		Customer arzu = new Customer("Arzu", "Aksu", "London", 5553322, 1987);
		Customer ozan = new Customer("Ozan", "Aksu", "London", 23444356, 2002); 
		Customer uygar = new Customer("Uygar", "Aksu", "London", 32425322, 2001);
		
		
		System.out.println(erhan.getAddress());
		System.out.println(arzu.getSurname());
		System.out.println(ozan.getAddress());
		System.out.println(uygar.getMobileNumber());
		
		
	
		
		
	}

}
