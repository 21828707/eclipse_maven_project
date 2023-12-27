package sample2;

// 인터페이스를 사용하여 결합도를 낮춘 형태.
// 그래도 여전히 객체를 생성하는 작업은 코드에 있어야 한다.
public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영문 메세지 출력
		MessageBean messageBean = new MessageBeanEn();
		messageBean.sayHello("spring");
		
		messageBean = new MessageBeanKr();
		messageBean.sayHello("spring");
	}

}
