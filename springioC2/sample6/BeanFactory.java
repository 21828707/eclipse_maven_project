package sample6;


// 빈객체를 생성하는 역할을 하는 팩토리 클래스.
public class BeanFactory {

	public Tv getBean(String beanName) {
		Tv tv = null;
		
		if(beanName.equals("samsung")) {
			tv = new SamsungTV();
		}else if(beanName.equals("lg")) {
			tv = new LgTV();			
		}
		
		return tv;
	}

}
