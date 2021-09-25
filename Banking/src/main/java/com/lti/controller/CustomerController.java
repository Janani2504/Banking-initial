package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.model.Address;
import com.lti.model.Customer;
import com.lti.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	public Customer addOrUpdateACustomer(Customer customer) {
		return customerService.addOrUpdateACustomer(customer);
	}
	
	
	public Customer addorUpdateCustomerWithAnAddress(Customer customer) {
		
		return customerService.addorUpdateCustomerWithAnAddress(customer);
	}

	
	public Address addAddressToACustomer(Address address) {
		
		return customerService.addAddressToACustomer(address);
	}

	
	public Address getCustomerAddressByCustomerId(int customerId) {
		
		return customerService.getCustomerAddressByCustomerId(customerId);
	}

	
	public Customer findCustomerById(int customerId) {
		
		return customerService.findCustomerById(customerId);
	}


}
