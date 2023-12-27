package sample6;

// 팩토리 클래스를 사용해서 느슨한 결합 구현
// 팩토리 클래스가 컨테이너 역할을 하는 형태
public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new BeanFactory();
		Tv tv = factory.getBean(args[0]);
		// ioc는 new를[객체를 직접 관리하지 않는다.] 사용하지 않는다.
		
		tv.turnOn();
		tv.upSound();
		tv.downSound();
		tv.turnOff();
	}

}
