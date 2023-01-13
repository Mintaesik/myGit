package ch16;

public class MyThread_Im_Use {
	public static void main(String[] args) {
		MyThread_Im my = new MyThread_Im();
		
		Thread t1 = new Thread(my, "스레드1");
		Thread t2 = new Thread(my, "스레드2");
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
}
