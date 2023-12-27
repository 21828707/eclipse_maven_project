package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import domain.Customer;
import service.CustomerService;
import service.DataNotFoundException;

@Controller
public class CustormerListController { 
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public String showAllCustomers(Model model) {
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers",customers);
		
		return "customer/list";
	}
	
	@GetMapping("/customer/{customerId}")
	public String showCustomerDetail(@PathVariable int customerId,
			Model model) throws DataNotFoundException {
		Customer customer = customerService.findById(customerId);
		model.addAttribute("customer", customer);// 모델을 통해 공유
		
		return "customer/detal";
	}
	
	@ExceptionHandler(DataNotFoundException.class) // 해당 오류가 발생하면 아래 발생
	public String handleException() {
		return "customer/notfound";
	}
}
