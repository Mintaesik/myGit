package ch04;

public class Star3 {
	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) { //같은 내부 for문에서는 같은 변수 사용해도 괜찮음.
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
