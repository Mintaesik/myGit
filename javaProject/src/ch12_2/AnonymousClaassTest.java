package ch12_2;

interface RemoteControl{//인터페이스는 인스턴스화 할 수 없다.
	void turnOn();
	void turnOff();
}



public class AnonymousClaassTest {
	public static void main(String[] args) {
		//interface는 new해서 객체생성을 못하지만 아래처럼
		//무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속받아
		//오버라이딩 처리 할 수 있다.
		RemoteControl ac = new RemoteControl() {//익명클래스
			
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
				
			}
		};//무명내부클래스 (세미클론 확인)
		ac.turnOn();
		ac.turnOff();
	}
}
