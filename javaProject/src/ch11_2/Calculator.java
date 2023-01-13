package ch11_2;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	default int exec(int i, int j) {//일반 메소드지만 default명시했기에 가능.
		return i + j;
	}
	
}
