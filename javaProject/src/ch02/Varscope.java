package ch02;

public class Varscope {//클래스
	static int x; // 전역변수(멤버,필드)는 선언만 해도 정수형 기본값이 설정되어있음.
	
	public static void main(String[] args) {//메소드
		//main + Ctrl +Spac ==> main 메소드 자동완성	
		int y = 0; //지역변수는 반드시 초기화를 해야된다.
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
