package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String [] name = new String [2];
		int[] kor = new int [2];
		int[] eng = new int [2];
		int[] mat = new int [2];
		int[] tot = new int [2];
		double[] avg = new double [2];
		double tot_avg = 0;
		
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = scan.next();
			System.out.print("국어점수 : ");
			kor [i] = scan.nextInt();
			System.out.print("영어점수 : ");
			eng [i] = scan.nextInt();
			System.out.print("수학점수 : ");
			mat [i] = scan.nextInt();
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i] / 3;
			tot_avg += avg[i];
			}
		scan.close();
		
		System.out.println("이름\t국어\t수학\t총점\t평균\t");
		for(int i=0; i<2; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		
		System.out.println("======================");
		System.out.println("학급평균 : "+tot_avg/2 );
	}
}
