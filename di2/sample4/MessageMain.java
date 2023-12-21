package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/applicationContext.xml");
		System.out.println("=======Container 초기화 완료=======");
		
		DateVO hong = factory.getBean("hong", DateVO.class);
		DateVO lee = factory.getBean("lee", DateVO.class);
		
		System.out.println(hong);
		System.out.println(lee);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
