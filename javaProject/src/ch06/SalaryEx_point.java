package ch06;

public class SalaryEx_point {
	static String[] name = {"박과장","김과장","이대리","최주임","홍실장"};
	static int[] salary = {3600,5000,3500,2000,3500};//연봉
	static int[] bonus = {0,0,0,0,0};//보너스
	static int[] total = new int [5]; //총액(연봉+보너스)
	static int[] tax = new int [5]; //세금
	static int[] pay = new int [5]; //실수령액
	static int pay_tot; //총지급액
	
	public static void cal() {
		for(int i=0; i<name.length; i++) {
		bonus[i] = (int)(salary[i]*0.3);
		total[i] = salary[i] + bonus[i];
		tax[i] = (int)(total[i] * 0.03);
		pay[i] = total[i] - tax[i];
		pay_tot += pay[i];
		}
	}
	
	public static void print() {
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+"\t"
		+tax[i]+"\t"+pay[i]);
		}
		System.out.println("총지급액 합계 : " + pay_tot);
		System.out.println("총지급액 평균 : " + pay_tot/5);
	}
	
	public static void main(String[] args) {
		cal();
		print();
	}
}

