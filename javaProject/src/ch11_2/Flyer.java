package ch11_2;

public interface Flyer {
	//interface는 추상 method만으로 구성된다.
	public void takeOff();
	public void fly();
	public void land();
//	public void a() {}; //인터페이스는 구현구가 있으면 에러가 남.

}
