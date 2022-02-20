package com.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddressList")
public class Address {
	@Id
	@GeneratedValue
	private int addressId;
	private String address;
	private String addressHolderName;

	
	private Address() {
		super();
	}

	private Address(int addressId, String address, String addressHolderName) {
		super();
		this.addressId = addressId;
		this.address = address;
		this.addressHolderName = addressHolderName;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressHolderName() {
		return addressHolderName;
	}

	public void setAddressHolderName(String addressHolderName) {
		this.addressHolderName = addressHolderName;
	}
}
