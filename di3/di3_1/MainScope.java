package di3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocation = new String[] {"di3_1/scope.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Executor executor = context.getBean("executor", Executor.class);
		
		executor.addUnit(new WorkUnit());
		executor.addUnit(new WorkUnit());
		executor.addUnit(new WorkUnit());
	}

}
