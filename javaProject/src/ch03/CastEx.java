package ch03;

public class CastEx {
	//자료형 변환
	public static void main(String[] args) {
		float f = 1.6F; //4바이트
		System.out.println(f);
		
		f = 100;
		System.out.println(f); //자동형변환 (정수100을 실수형타입에 맞춰서 실수 100.0F으로 변환)
		
		f = 100.5F;
		int i = (int)f; //강제형변환, 명시적형변환
		System.out.println(i); //강제형변환의 특징 값손실 우려가 있음, 소수점 아래 날라감
		
		
	}
}
