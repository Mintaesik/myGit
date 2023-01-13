package ch13;

public class Exam {
	public static void main(String[] args) {
		String a = "hello"; //String pool영역에 저장 => 내용만 메모리에 저장
		System.out.println(System.identityHashCode(a)); //객체 주소값 확인
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b); //주소값이 같냐?
		
		//대문자로 시작하기에 String은 객체이다,자주쓰기에 데이터 타입화
		String c = new String("hello"); //정상 => Heap메모리 영역에 저장
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d);
		System.out.println(c.equals(d)); //내용이 같냐?
	}
}
