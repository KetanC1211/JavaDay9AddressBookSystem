package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		String firstName,lastName,address,city,state,emailId,phoneNumber;
		int zip;
//		Taking details from User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Name");
		firstName = sc.nextLine();
		System.out.println("Enter Last Name");
		lastName=sc.nextLine();
		System.out.println("Enter Address ");
		address=sc.nextLine();
		System.out.println("Enter City Name");
		city=sc.nextLine();
		System.out.println("Enter State Name");
		state=sc.nextLine();
		System.out.println("Enter Email ID");
		emailId=sc.nextLine();
		System.out.println("Enter Phone number");
		phoneNumber=sc.nextLine();
		System.out.println("Enter Zip");
		zip=sc.nextInt();
		sc.close();
//		Displaying User details
		System.out.println(firstName+" "+lastName+" Details");
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip: "+zip);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Email Id: "+emailId);
	}

}
