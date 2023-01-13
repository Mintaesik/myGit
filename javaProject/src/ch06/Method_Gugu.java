package ch06;

import java.util.Scanner;

public class Method_Gugu {
	static int dan;
	
	public static void main(String[] args) {
		
		System.out.println("단을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		dan = scan.nextInt();
		gugu(dan); //이름이 있고 괄호가 있으면 메소드
		scan.close();
	}//프로그램 종료

	public static void gugu(int dan) { //dan=7 //void는 리턴해줄 값이 없는거임
		for(int i=0; i<=9; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		
	} 
	
}
