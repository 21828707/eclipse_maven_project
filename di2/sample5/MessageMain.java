package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample5/applicationContext.xml");
		System.out.println("=======Container 초기화 완료=======");
		
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);
		bean.helloCall();
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
