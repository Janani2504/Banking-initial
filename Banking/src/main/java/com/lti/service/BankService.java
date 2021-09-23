package com.lti.service;

import com.lti.model.Account;
import com.lti.model.Customer;

public interface BankService {
	 Customer addOrUpdateACustomer(Customer customer);
	 Account createAAccount(Account account);
	 

}
