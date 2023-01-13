package ch04;

import java.util.Scanner;

public class Nested_If_Score {
	public static void main(String[] args) {
		int score;
		char grade;
		char lev = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Java 점수 : ");
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score > 95) {
				lev = '+';
			}else if(score < 94) {
				lev = '0';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score > 85) {
				lev = '+';
			}else if(score < 84) {
				lev = '-';
			}
		}else {
			grade = 'F';
			System.out.println("재수강 대상입니다.");
		}
				
		System.out.println("당신의 점수는 "+ score + "이고 등급은 " + grade + lev + " 입니다.");
		
	}
}
