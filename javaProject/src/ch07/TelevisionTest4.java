package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7; //7이 갔다가 메소드로 
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel(); //메소드 호출에서 7이 리턴됨.
		System.out.println("현재 채널은 "+ch+"입니다.");
	}
}
