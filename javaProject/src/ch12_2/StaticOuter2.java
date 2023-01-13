package ch12_2;

public class StaticOuter2 {
	static int data=30;
	int data2=50;
	static class StaticInner2{
		void msg() {
			System.out.println("data is " + data); //static 멤버 사용가능 
//			System.out.println("data is " + data2);//non-static 멤버는 인스턴스화 하고 사용
		}
	}
	
	
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();//객체생성
		in.msg();
				
	}
	
}
