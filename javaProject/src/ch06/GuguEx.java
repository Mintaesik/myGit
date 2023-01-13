package ch06;

import java.util.Scanner;

public class GuguEx {
	static int y;
	
	public static void gugu(int dan) {
		System.out.println("==="+dan+"단===");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
	}
	
	public static void Gugu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		y = scan.nextInt();
		
		
	}
	
	public static void guguAll() {
		for(int i=1; i<=9; i++) {
			System.out.println("===="+i+"단====");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}
	
	public static void main(String[] args) {
		Gugu();
		gugu(y);
		guguAll();
		
//		for(int i=2; i<=9; i++) { //guguAll 같은 효과
//			gugu(i);
//		}
	}
	
}
