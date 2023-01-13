package ch06;

import java.util.Scanner;

public class HolidayEx_practice {
	static int y;
	
	public static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("근속년수를 입력하세요 : ");
		y = scan.nextInt();
		scan.close();
	}
	public static int holiday(int a) {
		int day = 0;
		if(a<=5) day=5;
		else if(a<=10) day=10;
		else day=20;
		
		return day;
	}

	public static void main(String[] args) {
		input();
		System.out.println("당신의 휴가일수는 : "+holiday(y));
	}
}
