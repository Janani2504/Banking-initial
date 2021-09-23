package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_bene")
public class Beneficiary {
	@Id
	@SequenceGenerator(name="bene_seq",initialValue=500,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bene_seq")
	int beneficiaryId;
	String beneficiaryName;
	int toAccountNo;
	
	
}
