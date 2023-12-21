package di3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLookup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocation = new String[] {"di3/lookup.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Processor processor = context.getBean("processor", Processor.class);
		processor.process("some");
		// processor.process()는 getCommandFactory()를 수행. 이는 xml파일에 의해
		// CommandFactoryImpl 빈을 반환하도록 설정되있다.
	}

}
