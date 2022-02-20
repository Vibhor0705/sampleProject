package com.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}
