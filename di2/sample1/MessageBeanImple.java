package sample1;

public class MessageBeanImple implements MessageBean {

	private String fruit;
	private int cost;
	
	public MessageBeanImple(String fruit) {
		// TODO Auto-generated constructor stub
		this.fruit = fruit;
		System.out.println("messagebeanimple 생성자 호출");
	}
	
	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setcost() 호출");
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(fruit + "\t" + cost);
	}

	@Override
	public void sayHello(String s, int b) {
		// TODO Auto-generated method stub
		System.out.println(s + "\t" + b);
	}

}
