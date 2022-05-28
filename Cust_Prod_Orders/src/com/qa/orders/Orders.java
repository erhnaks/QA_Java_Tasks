package com.qa.orders;

import com.qa.products.Products;

public class Orders extends Products {

	private int orderNumber;

	public Orders(String brand, String name, String description, int quantity, float price, boolean warranty,
			int orderNumber) {

		super(brand, name, description, quantity, price, warranty);
		this.orderNumber = orderNumber;

	}

	public void print() {

		System.out.println("Order details : ");
		super.print();
		System.out.println("\t" + orderNumber);

	}

	public Orders() {
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

}
