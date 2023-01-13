package ch12;

abstract class Action{
	public abstract void exec(); //추상메소드
}

public class ActionExam extends Action{

	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	public static void main(String[] args) {
		Action a = new ActionExam() {//익명내부클래스
			String name = "kim";
			@Override
			public void exec() {
				System.out.println("나는 " + name + "이다.");
			}
			
		}; //중괄호 끝에 ; 가 있으면 익명클래스라고 생각
			//익명클래스 블록 끝에는 ;(세미클론)으로 마무리
		a.exec();
	}

}
