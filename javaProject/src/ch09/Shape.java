package ch09;

public class Shape {//extends Object 
	private String name; //Circle, Triangle, Rectangle
	public Shape() {
		super(); // 부모클래스가 없는상태에서 super를 사용하면 Object라는 최상위 클래스를 부름.
				// Object 클래스의 기본생성자 호출 f3눌러 확인
	}
	public Shape(String name) { //name =Circle , Triangle, Rectangle
		super(); //무의미
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
}
