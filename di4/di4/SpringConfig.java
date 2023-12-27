package com.baek.di4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Camera camera1() {
		return new Camera();
	}
	@Bean
	public Camera camera2() {
		return new Camera();
	}
	@Bean
	public Camera camera3() {
		return new Camera();
	}
	@Bean
	public Camera camera4() {
		return new Camera();
	}
	
	@Bean
	@Qualifier("intrusionDetection")
	public InfraredRaySensor windowSensor() {
		return new InfraredRaySensor("창 센서");
	}
	@Bean
	@Qualifier("intrusionDetection")
	public InfraredRaySensor doorSensor() {
		return new InfraredRaySensor("문 센서");
	}
	@Bean
	public InfraredRaySensor lampSensor() {
		return new InfraredRaySensor("등 센서");
	}
	
	@Bean
	public AlarmDevice alarmDevice() {
		return new SmsAlarmDevice();
	}
	
	@Bean
	public DisplayStrategy displayStrategy() {
		return new DefaultDisplayStrategy();
	}
	
	@Bean
	public Viewer viewer() {
		MonitorViewer viewer = new MonitorViewer();
		viewer.setDisplayStrategy(displayStrategy());
		return viewer;
	}
	
	@Bean
	@Qualifier("main")
	public Recoder recoder() {
		return new Recoder();
	}
	
	@Bean(initMethod = "init")
	public HomeController homeController() {
		HomeController homeController = new HomeController();
		List<InfraredRaySensor> sensors = new ArrayList<InfraredRaySensor>();
		sensors.add(windowSensor());
		sensors.add(doorSensor());
		homeController.setSensors(sensors);
		
		homeController.prepare(alarmDevice(), viewer());
		
		homeController.setCamera1(camera1());
		homeController.setCamera2(camera2());
		homeController.setCamera3(camera3());
		homeController.setCamera4(camera4());
		
		return homeController;
	}
}
