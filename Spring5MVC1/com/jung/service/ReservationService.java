package com.jung.service;

import java.util.List;

import com.jung.domain.Reservation;

public interface ReservationService {
	List<Reservation> query(String courtName);
}
