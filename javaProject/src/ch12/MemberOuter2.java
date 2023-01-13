package ch12;

public class MemberOuter2 {
	static class TestInner{
		int num=1;
		String name="홍길동";
		String email="hong@gmail.com";
		public void print() {
			System.out.println("-------------------------");
			System.out.println("고객번호 : " + num );
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
			System.out.println("-------------------------");
		}
	}
	public static void main(String[] args) {
		MemberOuter2.TestInner test = new MemberOuter2.TestInner();
		test.print();
	}
}
