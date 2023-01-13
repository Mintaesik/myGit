package ch05_2;

import java.util.Scanner;

public class ArrayScore2d_Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int stu = scan.nextInt();
		int [][] scores = new int [stu][3];
		
		System.out.println("국,영,수 점수를 각각 입력하세요 : ");
		for(int i=0; i<scores.length; i++) {
			System.out.print(i+1 + "번 학생의 점수 : ");
			for(int j=0; j<scores.length; j++) {
				scores[i][j] = scan.nextInt();
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<scores.length; i++){
			int sum =0;
			float avg = 0.0F;
			String grade = "";
			System.out.printf("%d\t",i+1); //번호 추출
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%d\t",scores[i][j]);
				sum += scores[i][j];
			}
			avg = sum / scores[i].length;
			System.out.printf("%d\t",sum);
			System.out.printf("%.1f\t",avg);
//			System.out.printf("%d\t %.1f\t",sum,avg); 위랑 같은 출력

			if(avg>=90) System.out.printf("%s%n","A");
			else if(avg>=80) System.out.printf("%s%n","B");
			else if(avg>=70) System.out.printf("%s%n","C");
			else if(avg>=60) System.out.printf("%s%n","D");
			else System.out.printf("%s%n","F");
		
		}
	}
}

