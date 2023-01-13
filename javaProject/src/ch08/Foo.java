package ch08;

public class Foo {
	int a;
	double b;
	
	public Foo() {//생성자
		this(1); //똑같은 이름의 오버로딩된 다른 생성자를 호출하는 것임.
		int c = 1;
	}
	public Foo(int x) {//x=1
		a = x;
		b = 20.0;
	}

}
