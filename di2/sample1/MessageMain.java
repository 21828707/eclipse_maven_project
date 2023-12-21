package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample1/applicationContext.xml");
		//컨테이너 -> 빈 객체 생성.
		System.out.println("=======Container 초기화 완료=======");
		
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);
		bean.sayHello();
		bean.sayHello("melon", 5500);
		
		((ClassPathXmlApplicationContext)factory).close();
		// 컨테이너를 명시적으로 닫아준다.
	}

}
