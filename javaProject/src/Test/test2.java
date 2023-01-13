package Test;

public class test2 {
	public static void main(String[] args) {
//		int i = 1;
//		while(i <= 20) {
//			if(i % 5 ==0) {
//				System.out.println(i + ":5의 배수입니다.");
//				
//			}else {
//				System.out.println(i + ":5의 배수가 아닙니다.");
//			}
//			i++;
//		}
		
		int i = 1;
		for(i=1; i<=20; i++) {
			switch (i % 5) {
			case 0:
				System.out.println(i + " : 5의 배수입니다.");
				break;

			default:
				System.out.println(i + " : 5의 배수가 아닙니다.");
				break;
			}
		}
		
		
	}
}
