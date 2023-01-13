package ch11_2;

public abstract class AbstractClass {
	//하나라도 abstract 메서드가 있으면 클래스도 abstract해야함
	
	void method2() {
		System.out.println("완성된 method");
	}
	abstract void method1(); //추상메소드가 생기면 ==> 추상클래스로 변경
}
