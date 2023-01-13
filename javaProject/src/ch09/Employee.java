package ch09;

public class Employee {
	private int num; 
	public String name;
	String adress;
	String email;
	protected int salary;
	private String rrn;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	
}
