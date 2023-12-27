package sample4;

//결합도가 높은 형태
public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungTV sam = new SamsungTV();
		// 삼성 tv객체를 명시적으로 만들어서 사용해야 한다.
		sam.turnOn();
		sam.upSound();
		sam.downSound();
		sam.turnOff();
		
		LgTV lg = new LgTV();
		lg.turnOn();
		lg.upSound();
		lg.downSound();
		lg.turnOff();
	}

}
