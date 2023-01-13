package ch05_2;

public class ArrayScore2D {
	public static void main(String[] args) {
		int[][] scores = {{100,100,100}
		,{89,76,92}
		,{88,69,72}
		,{45,60,59}
		,{96,92,89}};
		
		System.out.println("번호"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"등급");
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			float avg = 0.0F;
			String grade = "";
			
			System.out.printf("%d\t",i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%d\t",scores[i][j]);
				sum += scores[i][j];
			}
			avg = sum / (float)scores[i].length; //묵시적 형변환 가능이지만 표기.
			
			System.out.printf("%d\t",sum);
			System.out.printf("%.1f\t",avg);
			
			if(avg>=90) System.out.printf("%s%n","A");
			else if(avg>=80) System.out.printf("%s%n","B");
			else if(avg>=70) System.out.printf("%s%n","C");
			else if(avg>=60) System.out.printf("%s%n","D");
			else System.out.printf("%s%n","F");
		}
	}
}
