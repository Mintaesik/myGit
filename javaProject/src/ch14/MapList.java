package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {//Student클래스 재활용
	static void print(Map<String, Object> map) { //매개변수로써 Map
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list"); //"list" 는 key값
		//ArrayList<Student> 라는 자료형타입(클래스)에 맞춰 형변환을 진행함.
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
					s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	
	
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>(); //맵 인스턴스
		List<Student> list = new ArrayList<>(); //리스트 인스턴스
		list.add(new Student("202301", "kim", "전산", 1, "park"));
		list.add(new Student("202202", "tim", "국문", 2, "tark"));
		list.add(new Student("202103", "him", "영문", 3, "hark"));
		map.put("list", list); //맵에 리스트 추가
		print(map); // 압축파일처럼 list 안의 3개의 객체가 map에 담겨져 print쪽의 매개변수화되어 값을 넘김
		
		
		
	}
}
