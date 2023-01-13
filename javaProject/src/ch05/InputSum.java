package ch05;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int num[] = new int[5];
//		int[] num = new int[5]; 위랑 똑같음
		int sum=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i] = scan.nextInt(); //숫자를 입력하는것도 배열로 접목가능함.
			sum=sum+num[i];
		}
		System.out.println("합계 : " + sum);
		scan.close();
	}
}
