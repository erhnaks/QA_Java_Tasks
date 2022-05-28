package com.qa.orders;

public class Main {

	public static void main(String[] args) {

		Orders one = new Orders("Samsung", "S10", "Molbie Phone", 1, 649.99F, true, 12);
		one.print();
		Orders two = new Orders("Apple", "XR", "Mobile Phone device", 2, 949.99F, true, 11);
		two.print();
		Orders three = new Orders("Hp", "Notebook", "EasyBook", 1, 349.99F, true, 14);
		three.print();
	}

}
