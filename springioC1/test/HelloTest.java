package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new FileSystemResource("src/applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		HelloBean hellobean = (HelloBean)beanFactory.getBean("helloBean");
		hellobean.printHello("이백승");
	}
//원인불명 -> module.info를 삭제하자 오류가 사라졌다.
}
