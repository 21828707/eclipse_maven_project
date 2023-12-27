package com.jung.web;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.jung.config.CourtConfiguration;

public class CourtServletContainerInitializer 
implements ServletContainerInitializer {

	public static final String MSG = 
			"Starting Sring5MVC1 Web Application";
	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext ctx) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(MSG);
		
		//스프링 설정 파일을 지정
		AnnotationConfigWebApplicationContext applicationContext
		= new AnnotationConfigWebApplicationContext();
		
		applicationContext.register(CourtConfiguration.class);
		
		DispatcherServlet dispatcherServlet =
				new DispatcherServlet(applicationContext);
		
		//애플리케이션에 dispatcherServlet 를 등록
		ServletRegistration.Dynamic courtRegistration = 
				ctx.addServlet("SpringMVC1", dispatcherServlet);
		
		courtRegistration.setLoadOnStartup(1);
		courtRegistration.addMapping("/");
		//courtRegistration.addMapping("/view/*"); getmapping("/view/welcome")
	}

}






