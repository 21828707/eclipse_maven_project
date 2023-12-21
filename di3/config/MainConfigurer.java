package com.baek.di3.config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConfigurer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocations = new String[] {"com/baek/di3/config/configurer.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		
		DatasourceFactory dataSource = context.getBean("dataSourceFactory", DatasourceFactory.class);
		System.out.println(dataSource);
	}

}
