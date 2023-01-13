package ch13;

public class Append {
	public static void main(String[] args) {
		String a = "hello";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		a = a+"java";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		System.out.println();
		
		StringBuilder b = new StringBuilder("hello");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b)); //주소값이 그대로기에 메모리 절약
		}
}
