package ch13_2;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming"; //str1 = str1 + " programming",  문자열 연결이지만 실제로
		//문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게 됨.
		System.out.println(str1.length()); //문자열의 길이값 확인
		String str2 = str1.concat(" programmer"); //concat()도 문자열 연결을 시켜줌
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2)); //n번째 문자
		System.out.println(str2.indexOf("programm")); // "program"의 시작문자열인 p문자의 위치값 리턴
		
		//중요중요중요중요
		System.out.println(str2.indexOf("z")); //내용이 없으면 -1을 리턴(중요)
		System.out.println(str2.substring(0, 4)); // substring(strat, end-1) => (0~3)
		System.out.println(str2.substring(5)); //5~끝까지 추출
		
		System.out.println(str2.replace("java", "jsp")); // java => jsp
		System.out.println(str2); //string의 불변성
		str2 = str2.replace("java", "jsp");
		System.out.println(str2);
		
		String str3 = "35778797879871234";
		System.out.println(str3.substring(5, 9)); //5부터 8(9-1)까지 추출
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
}
}
