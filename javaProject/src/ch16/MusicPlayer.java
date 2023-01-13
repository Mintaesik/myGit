package ch16;

public class MusicPlayer extends Thread{
	int type;
	MusicBox musicbox;  //MusicBox객체타입
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicbox = musicBox;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: musicbox.playMusicA(); break;
		case 2: musicbox.playMusicB(); break;
		case 3: musicbox.playMusicC(); break;
		}
	}

}
