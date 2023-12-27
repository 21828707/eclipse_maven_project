package sample1;

// 결합도가 높은 형태
public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 영문 메세지를 출력하려면,
		MessageBeanEn messageBeanEn = new MessageBeanEn();
		messageBeanEn.sayHelloEn("spring");
		
		// 한글 메세지를 출력하려면,
		MessageBeanKr messageBeanKr = new MessageBeanKr();
		messageBeanKr.sayHelloKr("spring");
	}

}
