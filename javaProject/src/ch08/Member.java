package ch08;

public class Member {
	private String name;
	private String userID;
	private int money;
	private String grade;
	
	public Member(String name, String userID, int money) {
		this.name = name;
		this.userID = userID;
		this.money = money;
		if(money>=100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}
				
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userID+"\t"+money+"\t"+grade);
	}
}
