package ch02;

public class Box {
	public static void main(String[] args) {
		double width, vertical, area, round; 
		width = 10.0;
		vertical = 5.0;
		
		area = width * vertical;
		round = 2.0 * (width + vertical);
		
		System.out.println("사각형의 넓이 : " +  area);
		System.out.println("사각형의 둘레 : " +  round);
	}
}
