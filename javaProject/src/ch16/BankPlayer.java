package ch16;

public class BankPlayer extends Thread{//스레드가 있으면 run 실행메소드 만들어야 함.
	int a;
	MyBank b;
	
	public BankPlayer(int a, MyBank b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
	switch (a) {
	case 1: b.printA(); break;
	case 2: b.printB(); break;
	case 3: b.printC(); break;

		}
	}
	
	
}
