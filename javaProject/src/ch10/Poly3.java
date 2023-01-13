package ch10;

class Pa3{
	static int num = 10;
	String name = "홍길동";
	public void print() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
	}
}

class Ch3 extends Pa3{
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	@Override
	public void print() {
		super.print();
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+hp);
	}
}

public class Poly3 {
	String addr = "서울 강남구 역삼동";
	public static void main(String[] args) {
		Pa3 p3 = new Ch3();
		p3.print();
		Poly3 ad = new Poly3();
		System.out.println("주소 : "+ad.addr);
	}
	
	
	
	
	
}

//
//package ch10;
//
//class Pa2 {
//	String name = "홍길동";
//	public void print() {
//		System.out.println("이름 : " + name);
//	}
//}
//
//class Ch extends Pa2{
//	int age=30;
//	@Override
//	public void print() {
//		super.print(); //부모쪽 프린트 호출
//		System.out.println("나이 : " + age);
//	}
//}
//
//
//public class Pa {
//	public static void main(String[] args) {
//		String tel = "010-1234-5678";
//		Pa2 c = new Ch(); //다형성
//		
//		c.print(); //자식쪽 print()호출
//		System.out.println("전화번호 : " + tel);
//	}
//}