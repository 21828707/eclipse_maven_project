package com.jung.domain;

import java.time.LocalDate;

public class Reservation {
	private String courtName;
	private LocalDate date;
	private int  hour;
	private Player player;
	private SportType sportType;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(String courtName, LocalDate date, int hour, Player player, SportType sportType) {
		super();
		this.courtName = courtName;
		this.date = date;
		this.hour = hour;
		this.player = player;
		this.sportType = sportType;
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
	
	
}
