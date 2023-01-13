package ch04;

public class GuguDan3 {
	public static void main(String[] args) {
		int dan;
		int i;
		
		for(dan=2; dan<=9; dan++){
			for(i=1; i<=9; i++){
				System.out.print(dan + "*" + i + "=" + dan*i + "  ");
			}
			System.out.println();
		}
	}
}
