package sample6;

public class SamsungTV implements Tv {
	public void turnOn() {
		System.out.println("SamSung TV 전원을 킨다.");
	}
	public void turnOff() {
		System.out.println("SamSung TV 전원을 끄다.");
	}
	public void upSound() {
		System.out.println("SamSung TV 볼륨을 올린다.");
	}
	public void downSound() {
		System.out.println("SamSung TV 볼륨을 내린다.");
	}
}
