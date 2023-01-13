package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스객체> -<Object>대신 만들어 놓은 Member객체를 제너릭하면 Member에서
		//쓰이는 모든 자료형을 처리할 준비가 가능해짐.
		List<Member> list=new ArrayList<>(); //멤버 클래스를 제너릭 한것  => 멤버에서 쓰이는 모든 자료형사용가능
		
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		//컬렉션은 객체를 처리하는 것임.
		//객체자료를 ArrayList에 담는 방법
		//1)방법 - 세터 게터를 활용하는 방법
		list.add(m1);  //ArrayList에 Member객체를 1개추가
		System.out.println(list.size());
		
		//2)방법  - 생성자를 활용하는 방법
		Member m2 = new Member("hong", "1234", "홍길동", "010-1234-5555", "hong@nate.com");
		list.add(m2);  //객체를 리스트에 담음.
		//ArrayList에 Member객체를 또 1개 추가
		System.out.println(list.size());
	
		//3)방법 - 생성자를 활용하는데 바로 add안에다 사용하는 방법
		list.add(new Member("choi", "1234", "최철수", "031-2323-4112", "rkotlsk@naver.com"));
		System.out.println(list.size());
	
		System.out.println("이름\t아이디\t비번\t전화\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i); //여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수
			System.out.println(m); //ArrayList안에 담겨있는 각각의 데이터들의 주소값들
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"
								+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	
	}
	
}
