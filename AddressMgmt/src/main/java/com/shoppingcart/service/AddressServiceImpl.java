package com.shoppingcart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.dao.AddressDao;
import com.shoppingcart.model.Address;
@Service
@Transactional
public class AddressServiceImpl implements IAddressService{

	@Autowired
	AddressDao dao;
	@Override
	public Address add(Address address) {
		return dao.save(address);
	}

	@Override
	public void remove(int addressId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Address> findAll() {
		return dao.findAll();
	}

}
