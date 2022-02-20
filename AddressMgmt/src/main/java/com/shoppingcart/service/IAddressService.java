package com.shoppingcart.service;

import java.util.List;

import com.shoppingcart.model.Address;

public interface IAddressService {
	public Address add(Address address);
	public void remove(int addressId);
	public List<Address> findAll();
	public default void abcd() {
		System.out.println("default method");
	}
	public static void bcd() {
		System.err.println();
	}

}
