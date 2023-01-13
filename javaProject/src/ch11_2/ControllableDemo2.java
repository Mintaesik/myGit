package ch11_2;

public class ControllableDemo2 {
	public static void main(String[] args) {
		Notebook n = new Notebook();
		n.turnOn();
		n.turnOff();
		n.repair();
		Controllable.reset();
	}
}
