package com.jung.domain;

public class SportType {
	private int id;
	private String name;
	
	public SportType() {
		// TODO Auto-generated constructor stub
	}

	public SportType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
