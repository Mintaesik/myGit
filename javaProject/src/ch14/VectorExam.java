package ch14;

import java.util.Iterator;
import java.util.Vector;

public class VectorExam { //컬렉션
	public static void main(String[] args) {
//		Vector v=new Vector(); //에러는 아니지만 아래처럼 하는게 좋다.
		Vector<Object> v = new Vector<Object>();
		//모든 자료형 처리 가능
		System.out.println("초기사이즈 : "+v.capacity());
		//벡터는 기본적으로 10개의 사이즈를 만들어 놓는다.
		v.add("first"); //add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("중간사이즈 : "+v.capacity());
		//입력된 데이터가 초기 10개의 사이즈에서 넘어가면 자동으로 또 10개의 사이즈를 추가로 만든다.
		System.out.println("데이터의 갯수 : "+v.size()); //배열의 length와 같다.
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t"); //배열[i]첨자를 쓰면 안된다. get을 통해서 값을 가져와야함.
		}
		
		System.out.println();
		v.add(6, 102); //벡터의 인덱스 6번째 자리에  데이터 추가
		v.remove(0); //요소 삭제
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t"); 
		}

		
	}

}
