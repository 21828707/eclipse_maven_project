package com.jung.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jung.domain.Reservation;
import com.jung.service.ReservationService;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping
	public void setUpForm() {
		
	}
	
	@PostMapping
	public String submitForm(@RequestParam("courtName") String courtName,
			Model model) {
		List<Reservation> reservations = java.util.Collections.emptyList();
		
		if(courtName != null) {
			reservations = reservationService.query(courtName);
		}
		
		model.addAttribute("reservations", reservations);
		
		return "reservationQuery";
	}
	
}










