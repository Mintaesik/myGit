package ch03;
//비트연산자
public class Bit {
	public static void main(String[] args) {
		System.out.println( 3 | 5 ); // 0011 | 0101 => 0111(7)긍정적인 연산자 하나만 1이어도 1
		System.out.println( 3 & 5 ); // 0011 & 0101 => 0001(1)부정적인 연산자 하나만 0이어도 0
		System.out.println( 3 ^ 5 ); // 0011 ^ 0101 => 0110(6)둘이 같으면 0 다르면 1
	}
}
