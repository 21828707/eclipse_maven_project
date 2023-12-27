package smaple3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 컨테이너(di) -> 빈의 생성, 구성 및 관리 당담. 애플리션 다양한 부분 간 의존성을 주입.
		// ioc를 수행하기 위해 di라는 방식 채택
		
		MessageBean bean = factory.getBean("MessageBean", MessageBean.class);
		bean.sayHello("spring");
	}

}
