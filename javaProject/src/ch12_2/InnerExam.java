package ch12_2;

import java.awt.Frame; //gui프로그램에 쓰여지는 클래스
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame {
	public InnerExam() { //기본생성자
		super("내부 클래스 테스트"); //부모생성자 호출
		setSize(300,400); //프레임크기인 가로,세로 초기사이즈 설정
		setVisible(true);
	}
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		//이벤트 처리: 사용자의 요청(request)에 시스템이 응답(response)
		//이벤트 3대 요소
		//1)이벤트 소스 : 이벤트의 대상
		//2)이벤트 리스너 : 이벤트 관찰자, 감시자
		//3)이벤트 핸들러 : 이벤트 처리기
		
		
		
//		e.addWindowListener(new WindowListener() {//무명클래스
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0); //프로그램 종료 코드
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		e.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
	
		
	}
}
