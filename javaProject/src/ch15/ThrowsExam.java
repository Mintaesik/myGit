package ch15;

public class ThrowsExam {
	//예외처리방법
	//1)try~catch 직접 처리
	//2)throws예외처리 클래스에 처리 위임
	
	//직접 try~catch절 대신 throws 뒤에 지정한 예외처리 클래스에 처리를 위임함.
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt (cpu 간섭)
			//cpu를 잠시 잠재움 1000은 1초
		}
	}
}
