package ch17_2;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener{
	private AudioClip audio; //사운드 처리 객체
	private JButton play,stop,loop;
	
	@Override
	public void init() { //JApplet을 상속받으면 반드시 init메소드 설정
		setLayout(new FlowLayout());
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//버튼추가
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		loop = new JButton("LOOP");
		add(play); add(stop); add(loop);
		//버튼에 이번트기능 추가
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource(); //명시적 형변환
		System.out.println(e.getSource());
		if(btn == play) { //플레이 버튼이 눌리면
			audio.play();
		}else if(btn == stop) {
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}
	}
}
