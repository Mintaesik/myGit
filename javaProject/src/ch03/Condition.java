package ch03;

public class Condition {
	public static void main(String[] args) {
		int num = -5;
		//System.out.println( num>0 ? num : -num ); // --5  3항연산자
		if(num>0) {
			System.out.println(num);
		}else {
			System.out.println(-num);
		}
	}


}
