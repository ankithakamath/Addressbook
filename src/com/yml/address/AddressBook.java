package com.yml.address;

import java.util.HashSet;
import java.util.Set;

public class AddressBook {
	
		
		 private Set<Contact> contactInfo = new HashSet<Contact>(); 
		 
		 
		 public void addContactDetails(Contact c) {
			contactInfo.add(c);
		 }
		 
		 public Set<Contact> getAddress(){
			 return contactInfo;
		 }
}
