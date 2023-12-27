package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// xml에서 생성된 빈객체를 가져온다.
		// 스프링 컨테이너에 의해 관리되는 재사용 가능한 소프트웨어 컴포넌트이다. 즉, 스프링 컨테이너가 관리하는 자바 객체
		Tv tv = factory.getBean(args[0], Tv.class);

		tv.turnOn();
		tv.upSound();
		tv.downSound();
		tv.turnOff();
	}

}
