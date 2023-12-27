package com.baek.di4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocation = new String[] {"com/baek/di4/contextAnnotaion.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		HomeController homeController = context.getBean("homeController", HomeController.class);
		
		homeController.checkSensorAndAlarm();
		
		InfraredRaySensor doorSensor = context.getBean("doorSensor", InfraredRaySensor.class);
		doorSensor.foundObject();
		
		homeController.checkSensorAndAlarm();
	}

}
