package ch14;

public class Type1 {
	private double value;
	private String value2;
	
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;  //지역변수와 멤버변수가 같을때 this처리
	}
	
	public static void main(String[] args) {
		Type1 t=new Type1();
		t.setValue(100.5);
		System.out.println(t.getValue());
		
		t.setValue2("민태식");
		System.out.println(t.getValue2());
		
	}//이렇게 계속 만드는 과정은 너무 복잡하다....
}
