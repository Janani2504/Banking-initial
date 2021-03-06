package com.lti.dao;

import java.util.List;

import com.lti.model.Account;
import com.lti.model.Beneficiary;
import com.lti.model.Transaction;

public interface TransactionDao {

	
//	addTransaction(int fromAct, int toAcc);
//	viewTransactionByAccoutNo(int accountNo);
//	viewAccountDetails(int accountNo);

	Account addAccountWithMultipleTransactions(Account account);

	//1st method
	Account addATransactionToAnAccount(Account account);
	
	//2nd method
	List<Transaction> fetchAllTransactionsOfAnAccount(int accountNo);

	//3rd
	Account fetchAccountDetailsByTransactionId(int transactionId);
	
	//4th
	Beneficiary addBeneficiaryToAnAccount(Beneficiary beneficiary);
	
	//5th
	List<Beneficiary> fetchAllBeneficiaryOfAnAccount(int accountNo);


    List<Account> updateAccountBalanceOnTransaction(Beneficiary beneficiary,int amount);
    
    Beneficiary findBeneficiaryById(int beneficiaryId);

}

