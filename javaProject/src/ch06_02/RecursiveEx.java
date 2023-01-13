package ch06_02;

public class RecursiveEx {
	
	static long fact1(int n) {
		return n==1? 1 : n * fact1(n-1);
	}
	
	static long fact2(int n) { //재귀호출기법을 길게 풀면 다음과 같음.
		long result=1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(fact2(5));
	}
}
