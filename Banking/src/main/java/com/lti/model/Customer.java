package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_cust")
public class Customer {
	@Id
	@SequenceGenerator(name="cust_seq",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cust_seq")
	int customerId;
	
	String firstName;
	String middleName;
	String lastName;
	String mobile;
	String email;
	String aadharNo;
	LocalDate dateOfBirth;
	String panCard;
	String password;
	String occupationType;
	int annualIncome;
	

}
