package ch05_2;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		int total=0;
		double avg=0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int stu = scan.nextInt();
		int [] scores = new int [stu];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			scores[i] = scan.nextInt();
			total += scores[i];
			avg = total / scores.length;
		}
		System.out.println("총점은 "+total+"점 입니다.");
		System.out.println("평균성적은 "+String.format("%.1f", avg)+ "점 입니다.");
	}
}