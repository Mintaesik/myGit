package ch14_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> b = new HashMap<>();
		List<EC> list = new ArrayList<>();
		
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918111168", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35917111175", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "32934111192", 2600000));
		
		b.put("a", list);
		print(b);
		
	}

	public static void print(Map<String, Object> b) {
		ArrayList<EC> list2 = (ArrayList<EC>) b.get("a"); 
			System.out.println("---------------------------------------------------------");
			System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
			System.out.println("---------------------------------------------------------");
			
			for(EC s : list2) {
				System.out.println(s.getNo()+"\t"+s.getOrderDate()+"\t"+s.getProduct()+"\t"
								+s.getCardName()+"\t"+s.getCardNo()+"\t"+s.getPay());
		}
			System.out.println("---------------------------------------------------------");
	}

}
