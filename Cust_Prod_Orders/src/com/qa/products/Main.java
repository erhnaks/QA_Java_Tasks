package com.qa.products;

public class Main {

	public static void main(String[] args) {

		Products samsung = new Products("Samsung", "S10", "Mobile device with 5G", 1000, 649.99F, true);
		Products iphone = new Products("Iphone", "XR", "Mobile device with 5G", 1000, 949.99F, true);
		Products google = new Products("Google", "Plus", "Mobile device with 5G", 1000, 449.99F, true);
		Products hp = new Products("HP", "Notebook", "Laptop", 1000, 1049.99F, true);
		Products dell = new Products("Dell", "X11", "Notebook", 1000, 349.99F, true);

		System.out.println(samsung.getBrand() + " " + samsung.getDescription() + " " + samsung.getPrice());

	}

}
