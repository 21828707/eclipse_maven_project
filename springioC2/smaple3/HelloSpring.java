package smaple3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean bean = factory.getBean("MessageBean", MessageBean.class);
		bean.sayHello("spring");
	}

}
