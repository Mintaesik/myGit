package ch04;

public class Do_While_Ex2 {
	public static void main(String[] args) {
		int n=1;
		do {
			System.out.println(n + "Hello World"); //반드시 한번은 수행
			n++; //증감식
		}while( n<=10 ); //조건문 
		System.out.println("while문 빠져나옴");
	}
}
