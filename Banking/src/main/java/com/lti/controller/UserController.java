package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.model.Account;
import com.lti.model.Customer;
import com.lti.service.BankService;

//@Component
@Controller
public class UserController {

	@Autowired
	BankService bankService;
	
	public Customer addOrUpdateACustomer(Customer customer) {
		return bankService.addOrUpdateACustomer(customer);
	}

	public Account createAAccount(Account account) {
		return bankService.createAAccount(account);
	}
	
}
