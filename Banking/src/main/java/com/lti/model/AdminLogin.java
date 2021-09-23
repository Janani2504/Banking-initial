package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="proj_admin")
public class AdminLogin {
	@Id
	@SequenceGenerator(name="admin_seq",initialValue=1000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="admin_seq")
	int adminId;
	
	String adminName;
	String password;
	

}
