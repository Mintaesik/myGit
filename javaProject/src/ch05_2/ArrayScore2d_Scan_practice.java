package ch05_2;

import java.util.Scanner;

public class ArrayScore2d_Scan_practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요 : ");
		int size = scan.nextInt();
		int [][] scores = new int [size][3];
		
		System.out.println("국,영,수 점수를 각각 입력하세요 : ");
		for(int i=0; i<size; i++) {
			System.out.printf("%d번 학생의 점수 : ",i+1);
			for(int j=0; j<3; j++) {
				scores [i][j] = scan.nextInt();
			}
		} scan.close();
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<size; i++) {
			int total = 0;
			double avg = 0;
//			String grade = "";
			System.out.printf("%d\t",i+1);
			for(int j=0; j<size; j++) {
				System.out.printf("%d\t",scores[i][j]);
				total += scores[i][j];
				avg = total / 3;
			}
//			avg = total / 3;
			System.out.printf("%d\t %.1f\t",total,avg);
			
			if(avg >= 90) System.out.println("A");
			else if(avg >= 80) System.out.println("B");
			else if(avg >= 70) System.out.println("C");
			else if(avg >= 60) System.out.println("D");
			else System.out.println("F");
		}
		
	}
}
