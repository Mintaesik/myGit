package ch05;

public class CharArray {
	public static void main(String[] args) {
//		char[] ch = {'J','a','v','a'};//char는 반드시 작은 따움표 사용 ''  //실무형 방식
		//정석으로 바꿔서 처리해보기
		//char[] ch;
		char[] ch;
		ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(i+"번째 문자 : " + ch[i]);
		}
	
	}
}
