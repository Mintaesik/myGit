package ch17_2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(6, 20); //6행 20열의 입력창 생성
	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta)); //스크롤바 생성 , textarea는 Scrollpane과 함께 써야함.
		tf.addActionListener(new ActionListener() { //텍스트를 입력하면 액션퍼폼드에 의해서 시행됨.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션리스너 실행");
				
				JTextField t = (JTextField)e.getSource(); //좌변이 부모타입이 아니라면 명시적 형변환을 통해 맞춰야한다. JTextField타입 = Object타입
				//데이터 타입이 좌,우변이 다를땐 최소한 좌변의 타입으로 맞춰야함.
				ta.append(t.getText() + "\n"); // \n줄바꿈 텍스트 필드의 문자열을 textarea영역으로 옮김
				t.setText(""); //현재 텍스트필드에 입력된 내용 지우기

			}
		}); //이벤트 처리
		setSize(250,200);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
