package ch10;
//주로 상속에서 사용
class Test11 {
	public void print() {
		System.out.println("test11");
	}
}

class Test22 extends Test11 {
	@Override //헤더라인은 같지만 내용은 재정의하는것이 오버라이딩
	public void print() {
		System.out.println("test22");
	}
}


public class OverrideEx {
	public static void main(String[] args) {
		Test22 t = new Test22();
		t.print();
	}
}
