package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample6/applicationContext.xml");
		System.out.println("=======Container 초기화 완료=======");
		
		Emp bean = factory.getBean("developer", Emp.class);
		System.out.println(bean);
		bean = factory.getBean("engineer", Emp.class);
		System.out.println(bean);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
