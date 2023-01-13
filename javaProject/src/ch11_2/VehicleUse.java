package ch11_2;

public class VehicleUse {
	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp();
		c.speedDown();
		c.handle();
		Boat b = new Boat();
		b.speedUp();
		b.speedDown();
		b.handle();
		Plane p = new Plane();
		p.speedUp();
		p.speedDown();
		p.handle();
		
		System.out.println();
		System.out.println();
		
		//다형성 기법
		Vehicle v = new Car();
		v.speedUp();
		v.speedDown();
		v.handle();
		v = new Boat();
		v.speedUp();
		v.speedDown();
		v.handle();
		v = new Plane();
		v.speedUp();
		v.speedDown();
		v.handle();
	}
}
