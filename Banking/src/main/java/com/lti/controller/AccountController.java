package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.model.Account;
import com.lti.model.Customer;
import com.lti.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	
	public Customer addNewCustomerWithOneAccount(Customer customer) {
	
		return accountService.addNewCustomerWithOneAccount(customer);
	}

	
	public Customer addNewCustomerWithMultipleAccounts(Customer customer) {
		
		return accountService.addNewCustomerWithMultipleAccounts(customer);
	}

	
	public Customer addAccountsToAnExistingCustomer(Customer customer) {
		
		return accountService.addAccountsToAnExistingCustomer(customer);
	}


	public List<Account> getAllAccountsOfACustomer(int customerId) {
		
		return accountService.getAllAccountsOfACustomer(customerId);
	}

	public Customer findCustomerByAccountNo(int accountId) {
	
		return accountService.findCustomerByAccountNo(accountId);
	}


	public Account addAccountWithAnExistingCustomer(Account account) {
		
		return accountService.addAccountWithAnExistingCustomer(account);
	}
	
	
	public Account findAccountByAccountNo(int accountNo) {
		
		return accountService.findAccountByAccountNo(accountNo);
	}


}
