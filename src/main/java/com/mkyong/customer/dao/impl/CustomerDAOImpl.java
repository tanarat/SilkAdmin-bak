package com.mkyong.customer.dao.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;

//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;
 
public class CustomerDAOImpl implements CustomerDAO{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	//add the customer
	public void addCustomer(Customer customer){
		
//		getHibernateTemplate().save(customer);
		
	}
	
	//return all the customers in list
	public Collection listCustomer(){
		return this.sessionFactory.getCurrentSession()
                .createQuery("from Customer")
                .list();
		
	}
	
}