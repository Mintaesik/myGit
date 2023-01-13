package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame{
	JPanel jp; //패널 변수 선언
	JButton jb1, jb2, jb3, jb4, jb5, jb6; //버튼 변수 선언
	
	public FlowLayoutEx2() {
		super("FlowLayout 예제2");
		jp = new JPanel(); //패널 생성
		jb1 = new JButton("버튼1"); //버튼생성 겸 호출
		jb2 = new JButton("버튼2");
		jb3 = new JButton("버튼3");
		jb4 = new JButton("버튼4");
		jb5 = new JButton("버튼5");
		jb6 = new JButton("버튼6");

		jp.add(jb1); //위에 생성한 버튼을 jp패널에 붙임
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
//		add(jp, "Center"); //그대로 사용하면 JFrame
		
		jp.setLayout(new FlowLayout()); //FlowLayout으로 변경
		add(jp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE이게 정식 문법인데 JFrame생략가능
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
