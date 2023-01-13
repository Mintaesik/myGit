package ch10;

public class StaticMethod2 {
	static int num=10; 
	static String name="홍길동";
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	
	public void printA() {
		System.out.println("====printA()====");
		System.out.println("사번 : "+ num);
		System.out.println("이름 : "+ name);
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+hp);
		System.out.println("주소 : "+addr);
	}
	
	public static void printB() {
		System.out.println("====printB()====");
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		StaticMethod2 b = new StaticMethod2();
		System.out.println("이메일 : "+b.email);
		System.out.println("전화 : "+b.hp);
		System.out.println("주소 : "+b.addr);
	}

	public static void main(String[] args) {
		StaticMethod2 ma = new StaticMethod2();
		ma.printA();
		printB();
	} 
	
}
