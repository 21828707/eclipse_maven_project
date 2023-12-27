package com.baek.di4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = makeContextByXml();
		run(context);
		
		context = makeContextByClass();
		run(context);
	}

	private static void run(ApplicationContext context) {
		// TODO Auto-generated method stub
		HomeController homeController = context.getBean("homeController", HomeController.class);
		homeController.checkSensorAndAlarm();
		
		InfraredRaySensor doorSensor = context.getBean("doorSensor", InfraredRaySensor.class);
		doorSensor.foundObject();
		homeController.checkSensorAndAlarm();
	}

	private static ApplicationContext makeContextByClass() {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		context.registerShutdownHook();
		return context;
	}

	private static ApplicationContext makeContextByXml() {
		// TODO Auto-generated method stub
		
		String[] configLocation = new String[] {"com/baek/di4/contextAnnotaion.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		context.registerShutdownHook();
		//@preDestroy 인식하도록 설
		return context;
	}

}
