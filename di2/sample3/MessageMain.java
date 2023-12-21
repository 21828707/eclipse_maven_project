package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample3/applicationContext.xml");
		System.out.println("=======Container 초기화 완료=======");
		
		AbstractTest bean = factory.getBean("test", AbstractTest.class);
		System.out.println("오늘은 " + bean.dayInfo());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
