package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.models.Customer;

import java.util.List;

public interface CustomerService {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
