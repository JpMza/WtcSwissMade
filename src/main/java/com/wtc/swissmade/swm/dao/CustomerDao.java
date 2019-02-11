package com.wtc.swissmade.swm.dao;

import com.wtc.swissmade.swm.models.Customer;

import java.util.List;

public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
