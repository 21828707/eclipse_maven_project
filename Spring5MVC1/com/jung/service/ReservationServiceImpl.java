package com.jung.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jung.domain.Player;
import com.jung.domain.Reservation;
import com.jung.domain.SportType;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {
    public static final SportType TENNIS = new SportType(1, "Tennis");
    public static final SportType SOCCER = new SportType(2, "Soccer");
    
    private final List<Reservation> reservations =
    		new ArrayList<Reservation>();
	
    public ReservationServiceImpl(){
    	reservations.add(new Reservation("Tennis #1",
    			LocalDate.of(2023, 9, 10), 16, new Player("oh", "N/A"), 
    			TENNIS));
    	reservations.add(new Reservation("Tennis #2", 
    			LocalDate.of(2023, 9, 10), 16, new Player("JJ", "N/A"), 
    			TENNIS));
    }
	@Override
	public List<Reservation> query(String courtName) {
		// TODO Auto-generated method stub
		return this.reservations.stream().filter(reservation -> 
		Objects.equals(reservation.getCourtName(), courtName))
				.collect(Collectors.toList());
	}

}








