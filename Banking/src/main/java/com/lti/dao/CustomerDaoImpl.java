package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Account;
import com.lti.model.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public Customer addOrUpdateACustomer(Customer customer) {
		Customer persistedUser = em.merge(customer);
		return persistedUser;
	}

	@Override
	@Transactional
	public Account createAAccount(Account account) {
		Account persistedUser = em.merge(account);
		return persistedUser;
	}

}
