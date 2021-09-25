package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.model.Account;
import com.lti.model.Beneficiary;
import com.lti.model.Transaction;
import com.lti.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	
	public Account addAccountWithMultipleTransactions(Account account) {
		
		return transactionService.addAccountWithMultipleTransactions(account);
	}

	
	public Account addATransactionToAnAccount(Account account) {
		
		return transactionService.addATransactionToAnAccount(account);
	}
	
	
	public List<Transaction> fetchAllTransactionsOfAnAccount(int accountNo) {
		
		return transactionService.fetchAllTransactionsOfAnAccount(accountNo);
	}

	
	public Account fetchAccountDetailsByTransactionId(int transactionId) {
		
		return transactionService.fetchAccountDetailsByTransactionId(transactionId);
	}
	
	
	public List<Account> updateAccountBalanceOnTransaction(Beneficiary beneficiary,int amount){
		return transactionService.updateAccountBalanceOnTransaction(beneficiary,amount);
	}


	public Beneficiary addBeneficiaryToAnAccount(Beneficiary beneficiary) {
		return transactionService.addBeneficiaryToAnAccount(beneficiary);
	}
	
	
    public	List<Beneficiary> fetchAllBeneficiaryOfAnAccount(int accountNo){
    	return transactionService.fetchAllBeneficiaryOfAnAccount(accountNo);
    }
    
    public Beneficiary findBeneficiaryById(int beneficiaryId) {
		return transactionService.findBeneficiaryById(beneficiaryId);
	}
	
}
