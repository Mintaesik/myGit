package ch09;

public class Manager extends Employee {
	private double bonus;
	
	public void input(int num, String name, String adress, String email, String rrn, int salary) {
		setNum(num);
		setRrn(rrn);
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.salary = salary;
		bonus = (salary * 0.3);
	}

	public void print() {
		System.out.println("================================");
		System.out.println("사번 : " + getNum() +"\n" + "이름 : " + name +"\n" + "주소 : " + adress +"\n" + "이메일 : " 
		+ email +"\n" + "주민번호 : " + getRrn() +"\n" + "연봉 : " + salary +"\n" + "보너스 : " + bonus);
		System.out.println("================================");
	}
}
