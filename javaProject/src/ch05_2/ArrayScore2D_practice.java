package ch05_2;

public class ArrayScore2D_practice {
	public static void main(String[] args) {
		int [][] scores = {{100,100,100}
		,{89,76,92}
		,{88,69,72}
		,{45,60,59}
		,{96,92,89}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<scores.length; i++) {
			int total = 0;
			float avg = 0.0F;
			System.out.printf("%d\t",i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%d\t",scores[i][j]);
				total += scores[i][j];
				avg = total / scores[i].length;
			}
			System.out.printf("%d\t %.1f\t",total,avg);
			if(avg >= 90) System.out.printf("%s%n","A");
			else if(avg >= 80) System.out.printf("%s%n","B");
			else if(avg >= 70) System.out.printf("%s%n","C");
			else if(avg >= 60) System.out.printf("%s%n","D");
			else System.out.printf("%s%n","F");
			
		}
	}
}
