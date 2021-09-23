package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_reg")
public class Register {
	@Id
	@SequenceGenerator(name="reg_seq",initialValue=5000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="reg_seq")
	int registerId;
	String transactionPassword;
	

}
