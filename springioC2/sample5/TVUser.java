package sample5;

// 인터페이스를 사용해서 결합도를 낮춘다.
public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTV();
		tv.turnOn();
		tv.upSound();
		tv.downSound();
		tv.turnOff();
		
		tv = new SamsungTV();
		tv.turnOn();
		tv.upSound();
		tv.downSound();
		tv.turnOff();
	}

}
