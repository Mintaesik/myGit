package ch04;

import java.util.Scanner;

public class While_Point2 {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		Scanner scanner = new Scanner(System.in); //컨트롤 쉬프트 O
		System.out.println("국어 영어 수학 점수를 각각입력하고 마지막에 -1을 입력하세요.");
		int n = scanner.nextInt();
		while(n != -1) {//-1이 입력되면 false가 되서 while문을 벗어남
			sum += n; //sum = sum+n
			count++;
			n = scanner.nextInt(); //(-1입력용)
		}
		
		if(count == 0)
			System.out.println("입력된 수가 없습니다."); //한줄짜리는 중괄호 생략 가능
		else {
			System.out.printf("총점은 %d 이고 평균은 %.1f 입니다.", sum, (double)sum/count);
		}
		scanner.close();
	}
}
