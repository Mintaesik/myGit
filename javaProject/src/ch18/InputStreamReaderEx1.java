package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream : 1바이트 단위로 읽음
//InputStreamReader : 문자단위(2byte)로 읽음

public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		//new InputStreamReader(InputStream) 처리해야함.
		InputStream is =System.in; //1바이트 처리 스트림
		InputStreamReader isr = new InputStreamReader(is); //2byte
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read();
			System.out.println("code : "+ code);
			char ch=(char)code; //문자
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //글자의 코드값
	
	}

}
