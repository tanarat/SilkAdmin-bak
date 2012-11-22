package com.mkyong.customer.dao;

import java.util.Collection;
import java.util.List;

import com.mkyong.customer.model.Customer;
 
public interface CustomerDAO{
	
	void addCustomer(Customer customer);
	
	Collection listCustomer();
	
}