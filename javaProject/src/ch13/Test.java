package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.floor(10.9));
		System.out.println(Math.pow(10,3));
		Random rand = new Random();
		System.out.println("정수값 : " + rand.nextInt(100)); //100이하 정수 랜덤
		System.out.println("실수값 : " + rand.nextDouble()); //1이하의 실수 랜덤
	
		int a=10;
		Integer b=20; //1.5이하 버전에서는 에러, intValue()가 작동
		Integer c=new Integer(30); //원래는 이렇게 처리하는게 맞음
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue()); //intValue 를 명시적으로 적어도 되고 생략해도 됨.
	}
}
