package com.jung.domain;

public class Player {
	private String name;
	private String pohone;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, String pohone) {
		super();
		this.name = name;
		this.pohone = pohone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPohone() {
		return pohone;
	}
	public void setPohone(String pohone) {
		this.pohone = pohone;
	}
}
