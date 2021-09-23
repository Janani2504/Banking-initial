package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_addr")
public class Address {
	@Id
	@SequenceGenerator(name="addr_seq",initialValue=100,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="addr_seq")	
    int addressId;
	
    String address;
    String landmark;
    String city;
    String state;
    String pincode;
   
}
