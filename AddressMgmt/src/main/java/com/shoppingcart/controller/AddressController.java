package com.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.model.Address;
import com.shoppingcart.service.IAddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	IAddressService service;
	@GetMapping("/findAll")
	public List<Address> FindAll(){
		return service.findAll();
	}
	@PostMapping("/add")
	public Address add(@RequestBody Address address){
		return  service.add(address);
	}
}
