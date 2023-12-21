package com.baek.di3;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext parentContext =
				new ClassPathXmlApplicationContext("com/baek/di3/parent.xml");

		String[] childLocations = new String[] {"com/baek/di3/child.xml"};
		AbstractApplicationContext childContext = 
				new ClassPathXmlApplicationContext(childLocations, parentContext);
		// 부모 컨텍스트에서 빈을 상속받아 자식 컨텍스트를 생성한다.
		
		SmsSender parentSender = parentContext.getBean("smsSender", SmsSender.class);
		SmsSender childSender = childContext.getBean("smsSender", SmsSender.class);
		
		
		System.out.println("parentSender == childSender : " + (parentSender == childSender));
		
		SystemMonitor monitor = childContext.getBean("monitor", SystemMonitor.class);
		System.out.println(monitor);
		
	}

}
