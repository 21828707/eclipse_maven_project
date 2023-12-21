package com.baek.d1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean helloBean1 = factory.getBean("helloBean", HelloBean.class);
        HelloBean helloBean2 = factory.getBean("helloBean", HelloBean.class);
        
        System.out.println("helloBean1 == helloBean2 : " + (helloBean1 == helloBean2));
        // 기본적으로 싱글톤
        // DTO, VO 같은 크래스들은 같은 객체(싱글톤)가 반환되면 안된다.
        // => 다른 빈객체를 얻어오기 위해 스코프를 지정해야 한다.
        // scope = "prototype" 지정 시 다른 객체가 반환된다.
        
        
//        helloBean.printHello("이백승1");
//        helloBean.printHello("이백승2");
        
        helloBean1.printHello();
        // 설정 파일에서 주입한 이름이 출력된다
    }
}
