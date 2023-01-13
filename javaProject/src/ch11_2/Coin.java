package ch11_2;

public interface Coin {//interface에는 추상메소드와 상수가 올 수 있다.
	//interface의 상수는 자동으로 public static final이 붙는다.
	//미국주화의 종류들 : 1penny=1cent , 1nickel=5cent , 1dime=10cent , 1quater=25cent
	
	int PENNY = 1, NICKEL = 5, DIME = 10, QUATER = 25;
}
