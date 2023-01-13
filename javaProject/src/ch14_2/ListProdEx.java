package ch14_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	public static void main(String[] args) { //맵, 리스트 둘다 좌변은 부모 우변은 자식 / 실제 쓰이는건 우변
//           데이터 타입       변수    new   생성자
//		제너릭클래스<적용할 타입> 변수 =  new 제너릭클래스<생략가능-타입>();
		Map<String, Object> map = new HashMap<>(); //해쉬맵 객체 생성
		List<ProdEx> list = new ArrayList<>(); //리스트 객체 생성
	    
		list.add(new ProdEx("TV", "oled123", "LG", 300, 10)); 
		list.add(new ProdEx("냉장고", "sm02re", "삼성", 200, 5)); 
		list.add(new ProdEx("에어컨", "win03", "위니아", 100, 8)); 
		list.add(new ProdEx("컴퓨터", "asus01", "아수스", 200, 6));
		
		//리스트에 담은걸 다시 맵에다 담는 과정
		map.put("list", list); //맵에 리스트 추가  //put("key",value)
		print(map);
	}
	
	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list"); //명시적 형변환 필요
		 //좌:ArrayList, 우:Object
		System.out.println("-------------------------------------(단위: 만원 )------");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("------------------------------------------------------");
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()+"\t"+
						s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		} 
		System.out.println("------------------------------------------------------");
	}
}
