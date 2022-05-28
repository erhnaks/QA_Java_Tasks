package com.qa.products;

public class Products {

	private String brand;
	private String name;
	private String description;
	private int quantity;
	private float price;
	private boolean warranty;

	public Products(String brand, String name, String description, int quantity, float price, boolean warranty) {

		this.brand = brand;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.warranty = warranty;

		System.out.println("New product has been added!");

	}

	public void print() {
		System.out
				.println("\t" + brand + " " + name + " " + description + " " + quantity + " " + price + " " + warranty);

	}

	public Products() {
	};

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	};

}
