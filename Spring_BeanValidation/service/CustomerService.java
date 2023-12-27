package service;

import java.util.List;

import domain.Customer;

public interface CustomerService {
	List<Customer> findAll();
	Customer findById(int id) throws DataNotFoundException;
	Customer register(Customer customer);
	void update(Customer customer) throws DataNotFoundException;
}
