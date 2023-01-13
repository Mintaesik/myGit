package ch16;

public class ThreadJoin extends Thread {
	//join() : join 메소드를 호출한 스레드가 종료될때까지 현재의 스레드를 대기시킴.
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+ "스레드가 시작되었습니다.");
		ThreadJoin e = new ThreadJoin();
		e.setName("스레드1"); //스레드 이름 지정 메소드
		e.start();
		try {
			e.join(); //새로운 작업을 요청하면 기다렸다가 다시 실행 - 싱글스레드처럼
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+ "스레드가 종료되었습니다.");
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ "스레드가 종료되었습니다.");
	}
}
