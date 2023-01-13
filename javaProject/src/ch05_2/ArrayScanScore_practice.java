package ch05_2;

import java.util.Scanner;

public class ArrayScanScore_practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		double avg = 0.0;
		
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int size = scan.nextInt();
		int [] scores = new int [size];
		
		for(int i=0; i<size; i++) {
			System.out.print("성적을 입력하세요 : ");
			scores [i] = scan.nextInt();
			
			total += scores[i];
			avg = total / size;
		}
		System.out.println("총점은 "+total+"점 입니다.");
		System.out.println("평균성적은 "+avg+"점 입니다.");
	}
}
