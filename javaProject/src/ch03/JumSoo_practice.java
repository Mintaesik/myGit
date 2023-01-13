package ch03;

import java.util.Scanner;

public class JumSoo_practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tot;
		double avg;
		
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("JAVA : ");
		int Java = scan.nextInt();
		System.out.println("DB : ");
		int DB = scan.nextInt();
		System.out.println("HTML : ");
		int HTML = scan.nextInt();
		
		tot = Java + DB + HTML;
		avg = tot / 3;
		
		System.out.println("==================================");
		System.out.println("이름\tJAVA\tDB\tHTML");
		System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML);
		System.out.println("==================================");
		
	}
}
