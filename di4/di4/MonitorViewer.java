package com.baek.di4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("viewer")
public class MonitorViewer implements Viewer {

	@Autowired
	private DisplayStrategy displayStrategy;
	
	public void setDisplayStrategy(DisplayStrategy displayStrategy) {
		this.displayStrategy = displayStrategy;
	}
	
	@Override
	public void add(Camera camera) {
		// TODO Auto-generated method stub
		System.out.println("MonitorViewer에 " + camera + "영상 추가");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("DisplayType " + displayStrategy.getDislpayStrategy().name() + "로 카메라 출력");
	}

}
