package ch07_2;

public class Employee2 {
	private String name;
	private	String part;
	private String position;
	private int basic=0;
	private int bonus=0;
	private int total=0;
	private int tax=0;
	private int pay=0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		bonus = basic * 3;
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getTotal() {
		total = basic + bonus;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTax() {
		tax = (int)(total * 0.033);
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getPay() {
		pay = total - tax;
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic
				+"\t"+getBonus()+"\t"+getTotal()+"\t"+getTax()+"\t"+getPay());
	}
	
	
	
}
