package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	private int tmp;
	
	public static void main(String[] args) {
		InputStreamReaderWhile isrw = new InputStreamReaderWhile();
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		try {
			System.out.print("원하는 글자를 입력하시오 : ");
			isrw.tmp = System.in.read();
			while(isrw.tmp != 13) { //엔터키의 코드값은 13
				System.out.println(isrw.tmp+"==>"+(char)isrw.tmp);
				isrw.tmp = System.in.read();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
