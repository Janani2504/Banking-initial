package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.model.Account;
import com.lti.model.Customer;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public Customer addOrUpdateACustomer(Customer customer) {
		
		return  customerDao.addOrUpdateACustomer(customer);
	}

	@Override
	public Account createAAccount(Account account) {
		
		return customerDao.createAAccount(account);
	}

}
