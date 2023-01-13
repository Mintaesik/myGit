package ch17_2;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("MyGridLayout 과제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("id : "));
		c.add(new JTextField("hong"));
		c.add(new JLabel("비밀번호 : "));
		c.add(new JPasswordField("****"));
		c.add(new JLabel("이메일 : "));
		c.add(new JTextField("hong@daum.net"));
		c.add(new JLabel("hp : "));
		c.add(new JTextField("010-1234-5678"));
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
	
}
