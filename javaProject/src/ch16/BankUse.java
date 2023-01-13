package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank m = new MyBank();
		
		BankPlayer p1 = new BankPlayer(1,m);
		BankPlayer p2 = new BankPlayer(2,m);
		BankPlayer p3 = new BankPlayer(3,m);
		
		p1.start();
		System.out.println("p1스타트");
		p2.start();
		System.out.println("p2스타트");
		p3.start();
		System.out.println("p3스타트");
		
	}
}
