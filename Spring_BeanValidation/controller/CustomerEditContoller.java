package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import domain.Customer;
import service.CustomerService;
import service.DataNotFoundException;

@Controller
@RequestMapping("/customer/{customerId}")
@SessionAttributes("editCustomer") // 동일한 고객 정보가 공유
public class CustomerEditContoller {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/edit")
	public String redirectToEntryForm(@PathVariable int customerId,
			Model model) throws DataNotFoundException {
		Customer customer = customerService.findById(customerId);
		model.addAttribute("editCustomer",customer);
		
		return "redirect:enter";
	}
	
	@GetMapping("/enter")
	public String showEntryForm(@ModelAttribute("editCustomer") Customer customer) { // 세션영역에 공유되기 때문
		return "customer/edit/enter";
	}
	
	@PostMapping(value="/enter", params = "_event_proceed")
	public String verify(@Valid @ModelAttribute("editCustomer") Customer customer,
			Errors errors) {
		if(errors.hasErrors()) {
			return "customer/edit/enter";
		}
		
		return "redirect:review";
	}
	
	@GetMapping("review")
	public String showReview(@ModelAttribute("edditCustomer") Customer customer) {
		return "customer/edit/review";
	}
	
	//재입력
	@PostMapping(value="/review", params="_event_revise")
	public String revise() {
		return "redirect:enter";
	}
	
	@PostMapping(value="review", params = "_event_confirmed")
	public String edit(@ModelAttribute("editCustomer") Customer customer)
			throws DataNotFoundException {
		customerService.update(customer);
		
		if(customer != null) {
			return "redirect:/customer";
		}
		else {
			throw new DataNotFoundException();
		}
	}
	
	@PostMapping(value="review", params="_event_edited")
	public String showEdited(@ModelAttribute("editCustomer") Customer customer,
			SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		
		return "customer/edit/edited";
		// 화면에서 뒤로가기 링크를 누르면 세션정보가 사라진 것을 확인할 수 있다.
		// list.jsp 상단에 고객정보가 사라짐.
	}
	
	@ExceptionHandler(DataNotFoundException.class) // 해당 오류가 발생하면 아래 발생
	public String handleException() {
		return "customer/notfound";
	}
}
