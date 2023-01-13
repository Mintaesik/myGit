package ch16;

public class MyThread_Ex extends Thread{
	public MyThread_Ex(String str) {
		super(str);
	}
	
	public void run() {
		synchronized (this) {
			for(int i=1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName()+"==>"+i);
			}
			notify();
		}
	}

}
