package ch05;

public class GetMin {
	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int minimuin;
		minimuin = s[0]; // minimuin=12
		for(int i=1; i<s.length; i++) {//i=0 은 이미 minumuin에 할당했기 때문에 1부터
			if(s[i] < minimuin) {//3<12
				minimuin = s[i]; //minimuin=3 변경
			}
		}
		System.out.print("최소값은 : " + minimuin);
	}
}
