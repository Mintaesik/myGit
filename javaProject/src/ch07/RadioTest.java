package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio brd = new Radio();
		brd.channel = 89.1;
		brd.onOff = true;
		brd.volume = 12;
		brd.printB();
		
		System.out.println();
		System.out.println();
	
		Radio ird = new Radio();
		ird.channel = 95.1;
		ird.onOff = false;
		ird.volume = 9;
		ird.printI();
	} 

}
