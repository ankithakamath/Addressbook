package com.yml.address;

import java.util.Comparator;

public class StateSort implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		return o1.getState().compareTo(o2.getState());
	}

}
