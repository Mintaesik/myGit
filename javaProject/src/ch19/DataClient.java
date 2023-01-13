package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
	public static void main(String[] args) throws Exception{
//		new Socket("ip주소",서버쪽에서 설정하 port번호);
		Socket s=new Socket("localhost",8000); //localhost대신 본인 ip주소 써도됨.
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받으려고함.
		String res=input.readLine();
		System.out.println(res);
		s.close();//소켓 닫기
		System.exit(0);//프로그램 종료
		//데이터서버쪽을 먼저 실행하고 데이터 클라이언트를 실행해야함.
	}
}
