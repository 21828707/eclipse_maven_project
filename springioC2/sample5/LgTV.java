package sample5;

public class LgTV implements Tv {
	public void turnOn() {
		System.out.println("LG TV 전원을 킨다.");
	}
	public void turnOff() {
		System.out.println("LG TV 전원을 끄다.");
	}
	public void upSound() {
		System.out.println("LG TV 볼륨을 올린다.");
	}
	public void downSound() {
		System.out.println("LG TV 볼륨을 내린다.");
	}
}
