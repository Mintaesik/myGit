package ch14;

import java.util.Scanner;

public class Product {
	private String number;
	private String name;
	private String company;
	private int price;
	private int count;
	private int money;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("제품번호 : ");
		number = sc.next();
		System.out.println("제품명 : ");
		name = sc.next();
		System.out.println("제조사 : ");
		company = sc.next();
		System.out.println("단가 : ");
		price = sc.nextInt();
		System.out.println("수량 : ");
		count = sc.nextInt();
		
		money = price*count;
		
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
}
