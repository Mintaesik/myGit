package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out; //프린트 전용 객체 PrintStream
		OutputStream os = ps; //PrintStream객체를 부모타입인 OutputStraeam으로 받아 처리
		//OutputStraeam도 1byte 처리 스트림이다. 한글 X
		try {
			os.write(97); // 97은 a의 코드값
			os.write(98); //b
			os.write(99); //c
			os.flush(); //flush() 메소드를 써야 출력까지 된다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
