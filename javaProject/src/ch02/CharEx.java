package ch02;

public class CharEx {
	public static void main(String[] args) {
		char aValue = '\u0041'; //캐릭터는 작은따움표를 써야함.
		System.out.println("char형('\u0041') : " + aValue);
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0041\') : " + bValue);
		//       \' => Single Quote를 표현
		//       \\ =  backslash를 표현
	
	}
}
