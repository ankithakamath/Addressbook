package com.yml.address;

import java.util.Comparator;

public class ZipSort implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		return Integer.compare(o1.getZip(), o2.getZip());
	}

}