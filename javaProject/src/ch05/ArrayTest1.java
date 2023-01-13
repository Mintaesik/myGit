package ch05;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] s = new int[10]; //10개의 배열크기 배열의 길이값
		for(int i=0; i<s.length; i++) {
			s[i] = i; // s[0]=0 , s[1]=1
			System.out.print(s[i] + " ");
		}
	}
}
