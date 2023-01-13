package ch11_2;

public class Plane implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane SpeendUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Plane SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");
	}

}
