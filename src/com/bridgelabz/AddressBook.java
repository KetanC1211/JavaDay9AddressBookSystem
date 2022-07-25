package com.bridgelabz;

import javax.print.event.PrintJobListener;

class AddressBook{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		ContactBook Amit = new ContactBook();
		Amit.getDetails();
		System.out.println("Amit Details are :");
		Amit.display();
//		Amit.ChangingCity("Kerla");
//		Amit.display();
//		Deleting Contact details
//		Amit = nul;
		//Creating new Contact
		ContactBook Rahul = new ContactBook();
		Rahul.getDetails();
		System.out.println("Rahul Details are :");
		Rahul.display();
		//trying to create Amit contact again
		//throw an error, will not allow user to create contact of same person
		//Comment out line 25 and 26 to resolve error
		ContactBook Amit = new ContactBook();
		Amit.getDetails();
	
	}
}
