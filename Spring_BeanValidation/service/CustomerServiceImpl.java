package service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import domain.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private Map<Integer, Customer> customerMap = new LinkedHashMap<Integer, Customer>();
	
	private int nextId = 1;
	
	private boolean isExists(int id) {
		return customerMap.containsKey(id);
	}
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Customer>(customerMap.values());
	}

	@Override
	public Customer findById(int id) throws DataNotFoundException {
		// TODO Auto-generated method stub
		if(!isExists(id)) {
			throw new DataNotFoundException();
		}
		return customerMap.get(id);
	}

	@Override
	public Customer register(Customer customer) {
		// TODO Auto-generated method stub
		nextId++;
		customerMap.put(nextId, customer);
		customer.setId(nextId);
		return customer;
	}

	@Override
	public void update(Customer customer) throws DataNotFoundException {
		// TODO Auto-generated method stubnew 
		if(!isExists(customer.getId())) {
			throw new DataNotFoundException();
		}
		
		customerMap.put(customer.getId(), customer);

	}
	
	@PostConstruct
	public void initCoustomer() {
		register(new Customer("오정원", "서울시", "aaa@aaa.com"));
		register(new Customer("최민수", "서울시", "bbb@aaa.com"));
		register(new Customer("황정민", "대구시", "ccc@aaa.com"));
	}

}
