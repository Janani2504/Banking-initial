package com.lti;
import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.UserController;
import com.lti.model.Customer;

public class BankTest {
	

	

	@Test
	public void addOrUpdateACustomer() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		UserController controller=(UserController)context.getBean(UserController.class);
		
		Customer customer=new Customer(0, "Janani", "", "Ramesh", "893993199", "januram@lti.com", "443453534342436", LocalDate.of(2000, 12, 12),
				"SDXGFDG574", "janu@257", "stategovt", 50000);
		Customer c=controller.addOrUpdateACustomer(customer);
		System.out.println(c);
	}

}
