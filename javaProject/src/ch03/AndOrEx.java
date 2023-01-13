package ch03;

public class AndOrEx {
	public static void main(String[] args) {
		int a = 7;
		//논리연산자 && 하나만 false여도 false
		System.out.println(a > 5 && a < 0 ); //  true && false >> false
		System.out.println(a > 5 || a < 0 ); //  true || false >> true
		
	}
}
