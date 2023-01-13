package ch05;

public class GetMinMax {
	public static void main(String[] args) {
		int [] m = {79,88,91,33,100,55,95};
		int minimum,maximum;
		minimum = m[0];
		maximum = m[6];
		
		for(int i=0; i<m.length; i++) {
			if(m[i] < minimum)
				minimum = m[i];
			if(m[i] > maximum)
				maximum = m[i];
		}
		System.out.println("최대값 : "+maximum);
		System.out.println("최소값 : "+minimum);
	}
}


//public class GetMin {
//	public static void main(String[] args) {
//		int s[] = {12,3,19,6,18,8,12,4,1,19};
//		int minimuin;
//		minimuin = s[0]; // minimuin=12
//		for(int i=1; i<s.length; i++) {//i=0 은 이미 minumuin에 할당했기 때문에 1부터
//			if(s[i] < minimuin) {//3<12
//				minimuin = s[i]; //minimuin=3 변경
//			}
//		}
//		System.out.print("최소값은 : " + minimuin);
//	}
//}
