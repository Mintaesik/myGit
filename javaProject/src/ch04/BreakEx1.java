package ch04;
//break(탈출문)
public class BreakEx1 {
	public static void main(String[] args) {
		int i=1; //조건문
		while(true) {//무한반복
			System.out.println(i++);
			if(i>10) break; //반복문을 종료시킴 , 중괄호로 표현할수도 있지만 한줄짜리라 생략해버림
			//if(i>10){
			// break;
		    // }
		}
		System.out.println("프로그램 종료");
	}
}
