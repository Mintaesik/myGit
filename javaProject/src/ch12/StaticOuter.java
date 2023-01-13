package ch12;

public class StaticOuter {
	static int x=10;
	static class Inner{
		int getX() {
			return x;
		}
	}
	
	public static void main(String[] args) {
		StaticOuter.Inner in = new StaticOuter.Inner(); //static 외부객체 먼저 생성 X
		System.out.println(in.getX());
	}
}
