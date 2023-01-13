package ch16;
//멀티스레드 : 작업단위가 2개 이상
//멀티스레드 구현하는 방법
//1. Thread를 상속
//2. Runnable(interface)을 구현


public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name); //매개변수가 1개 있는 부모생성자 호출 - 타이틀 설정
	}
	@Override //반드시 run오버라이드 해줘야함.
	public void run() {//스레드 실행 메소드
		for(int i=1;  i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //cpu를 1초간 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");

		e1.start(); //e1.run이 아니다. 스레드를 실행하려면 e1.start를 통해 e1.run();을 호출
					//e1.run();을 해버리면 메인스레드가 실행됨
		e2.start();//위와 동시에 호출
		e3.start();//위와 동시에 호출
		
		//cpu마음대로 호출
		
	}
}
