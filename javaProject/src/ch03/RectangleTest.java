package ch03;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		
	    //double horizontal, vertical; 을 선언하려면 아래 코드에서 중복 선언된 부분을 제거해야함.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		double horizontal = scan.nextDouble();
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		double vertical = scan.nextDouble();
		double area = horizontal * vertical;
		
		System.out.println("============================");
		System.out.println("직사각형의 가로 길이를 입력하세요 : " + horizontal);
		System.out.println("직사각형의 세로 길이를 입력하세요 : " + vertical);
		System.out.println("직사각형의 넓이는 : " + area + "입니다." );
		System.out.println("============================");
		
		scan.close();
				
				
	}
}
