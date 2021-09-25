package com.lti.dao;

import java.util.List;

import com.lti.model.Account;
import com.lti.model.Address;
import com.lti.model.Customer;

public interface CustomerDao {
 
    //1st method
	public Customer addOrUpdateACustomer(Customer customer);
 
	public Customer addorUpdateCustomerWithAnAddress(Customer customer);

	//2nd method
	public Address addAddressToACustomer(Address address);

	//4th method
	public Address getCustomerAddressByCustomerId(int customerId);

	//3rd method
	public Customer findCustomerById(int customerId);

	//___________________________________
	
	
	//___________________________________

 
 
 
 // addOrUpdateAddress();
// viewCustomerDetails();
// findAById();
// 

// registerForNetBanking();
// loginACustomer();
// 
// forgetPassword();
// setPassword();
// 
// addABeneficiary();
 
}
