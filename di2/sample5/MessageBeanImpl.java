package sample5;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String phone;
	private Outputter outputter;
	
	public MessageBeanImpl(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		System.out.println("1. Bean의 생성자 호출");
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("3. phone 입력 받음");
		// 다른 빈객체 만드는 것이 먼저 실행된다.
	}
	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		System.out.println("4. outputter 주입");
	}
	
	@Override
	public void helloCall() {
		// TODO Auto-generated method stub
		String message = name + " : " + phone;
		System.out.println(message);
		
		try {
			outputter.output(message);
			System.out.println("6. 작업 중");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
