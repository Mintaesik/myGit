package ch09;

public class ManagerTest {
	public static void main(String[] args) {
		Manager p1 = new Manager();
		
		p1.input(1, "홍길동", "서울 강남구 역삼동", "hong@gmail.com", "123456-1234567", 3000);
		p1.print();
	}
}
