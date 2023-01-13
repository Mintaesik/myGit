package ch06;

public class StudentPoint {
	static String [] name = {"홍길동","사임당","이순신"};
	static int [] code = {1001, 1002, 1003};
	static int [] Java = {90, 95, 84};
	static int [] DB = {85,79,92};
	static int [] HTML = {99,88,95};
	static int [] JSP = {76,92,72};
	static int [] total = {0,0,0};
	static double [] avg = {0.0,0.0,0.0}; 

	public static void getTot() {
		for(int i=0; i<=2; i++) {
			total[i] = Java[i] + DB[i] + HTML[i] + JSP[i];
		}
	}
	
	public static void getAvg() {
		for(int i=0; i<=2; i++) {
			avg[i] = (double)(total[i] / 4.0);
		}
	}

	public static void print(){
		System.out.println("전체학생수 : 3명");
		System.out.println("---------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("---------------------------------------------------------------");
		for(int i=0; i<=2; i++) {
			System.out.println(code[i]+"\t"+name[i]+"\t"+Java[i]+"\t"
		+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]+"\t"+total[i]+"\t"+String.format("%.1f", avg[i]));
		}
		System.out.println("---------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
	
}
