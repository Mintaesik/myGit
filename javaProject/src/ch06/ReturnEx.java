package ch06;

public class ReturnEx {
	//리턴값이 있는 메소드
	public static int sum(int a) { //리턴타입 int
		int result=0; //리턴시킬 변수 준비
		for(int i=1; i<=a; i++) {
			result = result + i;
		}
		return result;
	}
	public static void main(String[] args) {
		int n=sum(50); //sum 메소드 호출한 후 리턴받은값을 n에 저장
		System.out.println(n);
		n=sum(100); //메소드 재사용
		System.out.println(n);
		
	}
}
