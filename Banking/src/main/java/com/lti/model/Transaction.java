package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_tran")
public class Transaction {
	@Id
	@SequenceGenerator(name="tran_seq",initialValue=10500,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="tran_seq")
	int transactionId;
	int toAccountNumber;
	int amount;
	LocalDate transactionDate;
	String description;
}
