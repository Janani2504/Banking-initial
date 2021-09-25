package com.lti.service;

import java.util.List;

import com.lti.model.Account;
import com.lti.model.Beneficiary;
import com.lti.model.Transaction;

public interface TransactionService {
	Account addAccountWithMultipleTransactions(Account account);

	Account addATransactionToAnAccount(Account account); 
	
	List<Transaction> fetchAllTransactionsOfAnAccount(int accountNo);

	Account fetchAccountDetailsByTransactionId(int transactionId);
	
    List<Account> updateAccountBalanceOnTransaction(Beneficiary beneficiary,int amount);
    
	Beneficiary addBeneficiaryToAnAccount(Beneficiary beneficiary);
	
	
	List<Beneficiary> fetchAllBeneficiaryOfAnAccount(int accountNo);
	
	  Beneficiary findBeneficiaryById(int beneficiaryId);

}
