package com.yml.address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
	public static List<Contact> contactList = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		int choice = 0;
		while (choice != 5) {

			System.out.println("1 : Add Contact\n2 : Edit Contact\n3 : Dispplay \n 4: to exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addContact();
				break;
			case 2:
				editContact();
				break;
			case 3:
				displayContact();
				break;
			case 4:
				deleteContact();
				break;

			}
		}
	}

	private static void deleteContact() {
		System.out.println("enter the first name");
		sc.nextLine();
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		Contact person = getPerson(firstName, lastName);
		contactList.remove(person);
		
	}

	private static void displayContact() {
		for (Contact contact : contactList) {
			contact.display();

		}

	}

	public static void addContact() {
		System.out.println("enter the first name");
		sc.nextLine();
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		System.out.println("enter the addres");
		String address = sc.nextLine();
		System.out.println("enter the city");
		String city = sc.nextLine();
		System.out.println("enter the state");
		String state = sc.nextLine();
		System.out.println("enter the zip code");
		String zip = sc.nextLine();
		System.out.println("enter the phone Number");
		String phoneNumber = sc.nextLine();
		System.out.println("enter the email");
		String email = sc.nextLine();

		Contact c = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		contactList.add(c);

	}

	public static Contact getPerson(String firstName, String lastName) {
		for (Contact contact : contactList) {
			if (contact.firstName.equals(firstName) && contact.lastName.equals(lastName)) {
				return contact;
			}

		}
		return null;

	}

	public static void editContact() {

		System.out.println("enter the first name");
		sc.nextLine();
		String firstName = sc.nextLine();
		System.out.println("enter the last name");
		String lastName = sc.nextLine();
		System.out.println("hi");
		Contact person = getPerson(firstName, lastName);

		int choice = 0;
		while (choice != 9) {
			System.out.println(
					"1 First Name\n2 Last Name\n3 Address\n4 City\n5 State\n6Zip\n7 Phone number\n8Email\n9 Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the first name");
				sc.nextLine();
				String fname = sc.nextLine();
				person.firstName = fname;
				break;
			case 2:
				System.out.println("enter the last name");
				sc.nextLine();
				String lname = sc.nextLine();
				person.lastName = lname;
				break;
			case 3:
				System.out.println("enter the address");
				sc.nextLine();
				String address = sc.nextLine();
				person.address = address;
				break;
			case 4:
				System.out.println("enter the city");
				sc.nextLine();
				String city = sc.nextLine();
				person.city = city;
				break;
			case 5:
				System.out.println("enter state");
				sc.nextLine();
				String state = sc.nextLine();
				person.state = state;
				break;
			case 6:
				System.out.println("enter the zip code");
				sc.nextLine();
				String zip = sc.nextLine();
				person.zip = zip;
				break;
			case 7:
				System.out.println("enter phone number");
				sc.nextLine();
				String phone = sc.nextLine();
				person.phoneNumber = phone;
				break;
			case 8:
				System.out.println("enter email");
				sc.nextLine();
				String email = sc.nextLine();
				person.email = email;
				break;
			}
		}
	}

}