package com.yml.address;

import java.util.Comparator;

public class CitySort implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		return o1.getCity().compareTo(o2.getCity());
	}

}
