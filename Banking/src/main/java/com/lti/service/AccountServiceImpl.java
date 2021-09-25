package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AccountDao;
import com.lti.model.Account;
import com.lti.model.Customer;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDao accountDao;

	@Override
	public Customer addNewCustomerWithOneAccount(Customer customer) {
	
		return accountDao.addNewCustomerWithOneAccount(customer);
	}

	@Override
	public Customer addNewCustomerWithMultipleAccounts(Customer customer) {
		
		return accountDao.addNewCustomerWithMultipleAccounts(customer);
	}

	@Override
	public Customer addAccountsToAnExistingCustomer(Customer customer) {
		
		return accountDao.addAccountsToAnExistingCustomer(customer);
	}

	@Override
	public List<Account> getAllAccountsOfACustomer(int customerId) {
		
		return accountDao.getAllAccountsOfACustomer(customerId);
	}

	@Override
	public Customer findCustomerByAccountNo(int accountId) {
	
		return accountDao.findCustomerByAccountNo(accountId);
	}

	@Override
	public Account addAccountWithAnExistingCustomer(Account account) {
		
		return accountDao.addAccountWithAnExistingCustomer(account);
	}
	
	@Override
	public Account findAccountByAccountNo(int accountNo) {
		
		return accountDao.findAccountByAccountNo(accountNo);
	}

}
