package ch11_2;

//추상클래스를 쓰는 이유는 표준화(유지보수의 이유) 때문.
//추상클래스를 인스턴스(객체)를 만들 수 없음
//추상 메소드를 자식 클래스에서 구현해줘야함.

public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
	}
	public static void main(String[] args) {
//		AbstractClass a = new AbstractClass(); //추상클래스는 객체생성이 안된다.
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	
	}
	
}

