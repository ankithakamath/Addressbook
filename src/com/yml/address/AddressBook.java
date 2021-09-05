package com.yml.address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		List<Contact> contactList = new ArrayList<>();
//to add a new contact
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		System.out.println("enter the address");
		String address = sc.nextLine();
		System.out.println("enter the city");
		String city = sc.nextLine();
		System.out.println("enter the state");
		String state = sc.nextLine();
		System.out.println("enter the pin code");
		String zip = sc.nextLine();
		System.out.println("enter the phone Number");
		String phoneNumber = sc.nextLine();
		System.out.println("enter the email");
		String email = sc.nextLine();

		Contact c = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		contactList.add(c);

		c.display();

	}

}
