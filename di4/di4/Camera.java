package com.baek.di4;

import org.springframework.beans.factory.annotation.Required;

public class Camera {
	private int number;
	
	public Camera() {
		// TODO Auto-generated constructor stub
	}
	
	@Required
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Camera [number = " + number +"]";
	}
}
