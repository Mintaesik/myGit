package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class EventColor implements ActionListener{
	
	private JFrame f;
	private Color c;
	private Container con;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
		System.out.println("셋백그라운드 후");
	}
	
	public EventColor(JFrame f, Color c) {
		this.f = f;
		this.c = c;
		System.out.println("컨테이너 부르기 전");
		con = f.getContentPane();
		System.out.println("컨테이너 부른 후");
	}
}

public class MyEventColor extends JFrame  {
	private JButton b1, b2, b3, b4;
	
	public MyEventColor() {
	
		b1 = new JButton("North");
		System.out.println("b1종료");
		b2 = new JButton("South");
		System.out.println("b2종료");
		b3 = new JButton("East");
		System.out.println("b3종료");
		b4 = new JButton("West");
		System.out.println("b4종료");
		
		add(b1,"East");
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		
		b1.addActionListener(new EventColor(this, Color.red));
		b2.addActionListener(new EventColor(this, Color.blue));
		b3.addActionListener(new EventColor(this, Color.green));
		b4.addActionListener(new EventColor(this, Color.yellow));
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		 new MyEventColor();
		 System.out.println("전체 종료.");
	}
}
