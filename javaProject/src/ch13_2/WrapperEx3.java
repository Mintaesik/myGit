package ch13_2;

public class WrapperEx3 {
	public static void main(String[] args) {
		String str1 = "Hello 1234";
		
		System.out.println("(Character 사용)");
		for(int i=0; i<str1.length(); i++) {
			if(Character.isUpperCase(str1.charAt(i))) {
				System.out.println(str1.charAt(i)+"는 대문자입니다.");
			}else if(Character.isLowerCase(str1.charAt(i))) {
				System.out.println(str1.charAt(i)+"는 소문자입니다.");
			}else if(Character.isDigit(str1.charAt(i))) {
				System.out.println(str1.charAt(i)+"는 숫자입니다.");
			}
			
		}
		System.out.println("---------------------");
		System.out.println("(Integer 사용)");
		System.out.println("문자 "+str1.substring(6)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str1.substring(6))+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str1.substring(6))+" + 2 = "
				+ ""+(Integer.parseInt(str1.substring(6))+2)+" 입니다.");
		
	}
}
