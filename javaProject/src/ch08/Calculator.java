package ch08;

public class Calculator {
	private int left;
	private int right;
	
	public Calculator() { //ctrl+space를 통해 자동생성된 기본생성자를 명시할수 있음.
						//개발자가 만든 생성자가 있을 경우에는 기본생성자를 만들어줘야됨.
						// >> 다른생성자가 있을 경우 컴파일러가 자동생성하지 않는다.
		System.out.println("기본 생성자 호출...");
	}
	public Calculator(int left, int right) {//오버로딩  //개발자가 만든 생성자
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left=left;
		this.right=right;
		
	}
	//getter,setter 추가
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
	
}
