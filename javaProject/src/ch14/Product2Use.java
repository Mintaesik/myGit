package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product2Use {
	public static void main(String[] args) {
		List<Product2> pr = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			Product2 p = new Product2();
			p.input();
			pr.add(p);
			
			System.out.println("끝내려면 0을 입력하시오.(계속 진행하려면 아무 정수나 입력) : ");
			int tmp= scan.nextInt();
			if(tmp==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}else {
				continue;
			}
		}
		
		System.out.println("================================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t세금");
		System.out.println("----------------------------------------------------------------------");
		for(int i=0; i<pr.size(); i++) {
			Product2 a = pr.get(i);
			System.out.println(a.getNumber()+"\t"+a.getName()+"\t"+a.getCompany()+"\t"+
					a.getPrice()+"\t"+a.getCount()+"\t"+a.getMoney()+"\t"+a.getVat());
		}
		System.out.println("================================================================");
	}
}
