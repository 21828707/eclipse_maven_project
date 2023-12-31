package com.baek.di4;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class HomeController {
	private AlarmDevice alarmDevice;
	private Viewer viewer;
	
	@Resource(name="camera1")
	private Camera camera1;
	
	@Resource(name="camera2")
	private Camera camera2;
	
	@Resource(name="camera3")
	private Camera camera3;
	
	private Camera camera4;
	
	private List<InfraredRaySensor> sensors;
	
	@Autowired
	@Qualifier("main")
	private Recoder recoder;
	
	private DisplayStrategy displayStrategy;
	
	@Autowired
	public void prepare(AlarmDevice alarmDevice, Viewer viewer) {
		this.alarmDevice = alarmDevice;
		this.viewer = viewer;
	}
	
	@Autowired
	@Qualifier("intrusionDetection")
	public void setSensors(List<InfraredRaySensor> sensors) {
		this.sensors = sensors;
		
		for(InfraredRaySensor sensor : sensors) {
			System.out.println("센서 등록 : " + sensor);
		}
	}
	
	//=================JAVA config=======================
	public void setCamera1(Camera camera1) {
		this.camera1 = camera1;
	}
	public void setCamera2(Camera camera2) {
		this.camera2 = camera2;
	}
	public void setCamera3(Camera camera3) {
		this.camera3 = camera3;
	}
	//====================================================
	@Resource(name="camera4")
	public void setCamera4(Camera camera4) {
		this.camera4 = camera4;
	}
	
	@Resource(name="displayStrategy")
	public void setDisplayStrategy(DisplayStrategy displayStrategy) {
		this.displayStrategy = displayStrategy;
	}
	
	@PostConstruct
	public void init() {
		viewer.add(camera1);
		viewer.add(camera2);
		viewer.add(camera3);
		viewer.add(camera4);
	}
	@PreDestroy
	public void close() {
		System.out.println("close");
	}
	
	public void checkSensorAndAlarm() {
		for(InfraredRaySensor sensor : sensors) {
			if(sensor.isObjectFound()) {
				alarmDevice.alarm(sensor.getName());
			}
		}
	}
}
