package ch02;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		//int num;  미리 선언을 하고 아래로 가도 되고 아래처럼 바로 해도 된다.
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		// a%b a를 b로 나눈 나머지값
		//3항 연산자 ==>  1항?  2항(true) : 3항(false)
		in.close();
	
	}
}
