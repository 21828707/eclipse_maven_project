package com.baek.di4;

public class InfraredRaySensor {
	private String name;
	private boolean objectFound;
	
	public InfraredRaySensor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isObjectFound() {
		return objectFound;
	}

	public void setObjectFound(boolean objectFound) {
		this.objectFound = objectFound;
	}
	
	public void foundObject() {
		objectFound = true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "InfraredRaySensor[name = " + name + ", objectFound = " + objectFound + "]";
	}
}
