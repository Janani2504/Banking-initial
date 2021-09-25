package com.lti;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.AccountController;
import com.lti.controller.CustomerController;
import com.lti.controller.TransactionController;
import com.lti.model.Account;
import com.lti.model.AccountType;
import com.lti.model.Address;
import com.lti.model.ApprovalStatus;
import com.lti.model.Beneficiary;
import com.lti.model.Customer;
import com.lti.model.Transaction;

public class BankTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
	CustomerController controller=(CustomerController)context.getBean(CustomerController.class);
	
	AccountController acontroller=(AccountController)context.getBean(AccountController.class);
	
	TransactionController tcontroller=(TransactionController)context.getBean(TransactionController.class);
	
	
	@Test
	public void addOrUpdateACustomer() {
		
		Customer customer=new Customer(0, "Janani", "", "Ramesh", "893993199", "januram@lti.com", "443453534342436", LocalDate.of(2000, 12, 12),
				"SDXGFDG574", "janu@257", "stategovt", 50000);
		Customer c=controller.addOrUpdateACustomer(customer);
		System.out.println(c);
	}

	
	@Test
	public void addAddressToACustomer() {
		Customer c=controller.findCustomerById(44);
		if(c.getAddress()==null)
		{

			Address address=new Address();
			address.setCity("Chennai");
			address.setAddress("No.12,Gandhi Street");
			address.setLandmark("Near Bank");
			address.setState("TamilMNadu");
			address.setPincode("600110");
			address.setCustomer(c);
			
			controller.addAddressToACustomer(address);
			
			
		}
		else
		{
			System.out.println("This customer has a address");
		}
		
	}

	@Test
	public void findCustomerById() {
		Customer a=controller.findCustomerById(44);	
		System.out.println("CustomerId: "+ a.getFirstName());
			
	}
	

	@Test
	public void getCustomerAddressByCustomerId() {
		Address a=controller.getCustomerAddressByCustomerId(43);
		System.out.println(a);
		
	}
	//____________________________________________AccountDao__________________________________
	
	@Test
	public void addAccountForExistingCustomer() {
		
		Customer customer = controller.findCustomerById(44);
		Address address=controller.getCustomerAddressByCustomerId(44);
		if(address!=null) {
		Account account = new Account();
		account.setAccountType(AccountType.SAVINGS);
		account.setBalance(5000);
		account.setStatus(ApprovalStatus.APPLIED);
		account.setCustomer(customer);
		
		acontroller.addAccountWithAnExistingCustomer(account);
		}
		else {
			System.out.println("Add address to the customer");
		}
	}
	
	@Test
	public void findCustomerByAccountNo() {
		Customer a=acontroller.findCustomerByAccountNo(1020);
		System.out.println("CustomerId: "+ a.getCustomerId());
		
	}
	
	@Test
	public void findAccountByAccountNo() {
		Account a=acontroller.findAccountByAccountNo(1020);
		System.out.println(a);
		
	}
	
	@Test
	public void getAllAccountsOfACustomer() {
		List<Account> allaccount=acontroller.getAllAccountsOfACustomer(43);
		for(Account i:allaccount)
		{
			System.out.println(i.getAccountNo()+" "+i.getBalance()+" "+i.getAccountType());
		}
		
	}
	
	//______________________________________________TransactionDao_______________________________________________________________
	
	
	@Test
	public void addATransactionToAnAccount() {
		//Account account=acontroller.findAccountByAccountNo(1020);
		
		Beneficiary b=tcontroller.findBeneficiaryById(500);
		Account a=b.getAccount();
		
	    

		Transaction transaction1 = new Transaction();
		transaction1.setAmount(20);
		transaction1.setTransactionDate(LocalDate.of(2022, 8, 20));
		transaction1.setToAccountNumber(b.getToAccountNo());
		transaction1.setDescription("Fund Transfer");
		transaction1.setAccount(a);
		
		List<Transaction> trans = new ArrayList<Transaction>();
		trans.add(transaction1);
		
		a.setTransaction(trans);
		
		a.setBalance(a.getBalance()-transaction1.getAmount());
		
		Account toAccount=acontroller.findAccountByAccountNo(b.getToAccountNo());
		System.out.println(toAccount);
		//toAccount.setTransaction(trans);
		toAccount.setBalance(toAccount.getBalance()+transaction1.getAmount());
		acontroller.addAccountWithAnExistingCustomer(toAccount);
		
	   tcontroller.addATransactionToAnAccount(a);
		
		//tcontroller.updateAccountBalanceOnTransaction(b,transaction1.getAmount());
				 
	}
	
//	@Test
//	public void fetchAllTransactionsOfAnAccount() {
//		List<Transaction> alltrans=dao.fetchAllTransactionsOfAnAccount(1016);
//		for(Transaction i:alltrans)
//		{
//			System.out.println(i.getTransactionId()+" "+i.getTransactionDate()+" "+i.getType());
//		}
//		
//		
//	}
	
	
	@Test
	public void addBeneficiaryToAnAccount() {
		
		Account a=acontroller.findAccountByAccountNo(1022);
		
		Beneficiary beneficiary=new Beneficiary();
		beneficiary.setBeneficiaryName("Janani");
		beneficiary.setToAccountNo(1020);
		beneficiary.setAccount(a);
		
		List<Beneficiary> b=new ArrayList<>();
		b.add(beneficiary);
		
		a.setBeneficiary(b);
		tcontroller.addBeneficiaryToAnAccount(beneficiary);
		
	}
	
	@Test
	public void fetchAllBeneficiaryOfAnAccount() {
		List<Beneficiary> allbene=tcontroller.fetchAllBeneficiaryOfAnAccount(1022);
		for(Beneficiary i:allbene)
		{
			System.out.println(i.getBeneficiaryName());
		}
		
	}
	
	@Test
	public void findBeneficiaryById() {
		Beneficiary b=tcontroller.findBeneficiaryById(500);
		System.out.println(b.getBeneficiaryName());
	}

	

}
