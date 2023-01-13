package ch15;

public class Test {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("ABC"); //파스인트는 숫자형태의 문자열이어야함.
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
