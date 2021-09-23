package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_acc")
public class Account {
	@Id
	@SequenceGenerator(name="acc_seq",initialValue=10000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="acc_seq")
	int accountNo;
	
	int balance;
	AccountType accountType;
	ApprovalStatus status;
	
}
