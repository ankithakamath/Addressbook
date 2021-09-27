package com.yml.address;

import java.util.*;

public class AddressBook {

	static List<Contact> contactInfo = new ArrayList<Contact>();

	public void addContactDetails(Contact c) {
		contactInfo.add(c);
	}

	public List<Contact> getAddress() {
		return contactInfo;
	}

}