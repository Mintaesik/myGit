package ch07;

public class Person {
//	String name; //default 는 default 라고 명기하면 오류가 남.
//	int age;
//	double height

	//멤버변수
	private String name;
	private int age;
	private double height;
	
	//setter : set+변수명
	public void setName(String name) {//지역변수
		this.name = name;   //지역변수를 멤버변수에 대입 >>this는 멤버변수를 가르키는 키워드 
							//지역변수랑 멤버변수가 똑같아서 표시가 필요함.
	}
	//getter : get+변수명
	public String getName() { 
		return name;
		
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setAge(int age) {
		if(age < 0 || age >150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	public void print() {
		System.out.println("이름 : "+name+",나이 : "+age+",키 :  "+height);
	}
	
	
	
	
}
