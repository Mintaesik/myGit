package ch08;

public class Person {
	//멤버변수
	private String name; 
	private int height;
	private int weight;
	
	//생성자의 주 역할은 setter역할이다.
	public Person() {
		this("홍길동",170,60); //(String, int, int)형태의 다른 생성자 호출
	}
	public Person(String name) {
		this(name,190,100);
	}
	public Person(String name, int height) {
		this(name,height,70); //다른생성자 호출
		
	}
	public Person(String name, int height, int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : "+ name);
		System.out.println("신장 : "+ height);
		System.out.println("체중 : "+ weight);
		
	}
	
}
