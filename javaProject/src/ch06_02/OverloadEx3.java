package ch06_02;

public class OverloadEx3 {
	static String name = "김과장";
	static int sal= 560;
	static double tax=0.0;
	static double pay=0.0;
	
	public static void main(String[] args) {
		cal();
		print();
	}
	
	public static void cal() {//계산용
		tax = (double)(sal * 0.3);
		pay = (double)(sal - tax);
		
	}
	
	public static void print() {
		System.out.println("========================================");
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+sal+"\t"+tax+"\t"+pay);
	}
	
}
