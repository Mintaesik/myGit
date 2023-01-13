package ch05_2;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		for(int aa : numbers) { //for~each문(향상된 for문) //객체를 다룰때 유용한 기법
			System.out.println(aa);
		}
	}
}


