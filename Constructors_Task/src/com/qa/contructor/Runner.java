package com.qa.contructor;

public class Runner {

	public static void main(String[] args) {

		Bank erhan = new Bank(12345, "Personal", 11.34F, "remember", 100);

		Bank Devin = new Bank(1234567, "Personal", 9.99F, "Remember2", 1000);

		Bank Ridwan = new Bank(1237462783, "Personal", 10.99F, "memorable", 100);

		Bank Trevor = new Bank(1247283642, "Personal", 10.99F, "memorable", 100);

		System.out.println(erhan.getaccNumber());
		Ridwan.setAccNumber(1232536678);
		System.out.println(Ridwan.getaccNumber());

		erhan.setoverDraft(5000);
		System.out.println(erhan.overDraft());

	}

}
