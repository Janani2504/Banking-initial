package com.lti.dao;

import java.util.List;

import com.lti.model.Account;
import com.lti.model.Customer;

public interface AccountDao {

	/*
	 * viewAccountDetails(); viewAccountStatement();
	 * 
	 */
	public Customer addNewCustomerWithOneAccount(Customer customer);

	public Customer addNewCustomerWithMultipleAccounts(Customer customer);

	public Customer addAccountsToAnExistingCustomer(Customer customer); 
	
	//1st method
	public Account addAccountWithAnExistingCustomer(Account account);

	//4th method
	public List<Account> getAllAccountsOfACustomer(int customerId);  //viewAccount details

	//2nd method
	public Customer findCustomerByAccountNo(int accountNo);
	
	//3rd method
	public Account findAccountByAccountNo(int accountNo);
	
	
	
}
