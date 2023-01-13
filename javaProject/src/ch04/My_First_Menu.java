package ch04;

import java.util.Scanner;

public class My_First_Menu {
	public static void main(String[] args) {
		int menu,kor,wes,chi = 0;
		Scanner scan = new Scanner(System.in);

		exit_while:

			while(true){
				System.out.println("== [메뉴] ==");
				System.out.println("(1) 한식");
				System.out.println("(2) 양식");
				System.out.println("(3) 중식");
				System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
				String tmp = scan.next();
				menu = Integer.parseInt(tmp);

				if(menu==0) {
					System.out.println("메뉴 선택이 종료되었습니다.");
					break;
				}else if(menu<1 || menu>3) {
					System.out.println("메뉴를 잘못 선택하셨습니다.");
					continue;
				}
				
				if(menu==1) {
					while(true) {
						System.out.println("[한식메뉴]");
						System.out.println("(1) 김치찌개");
						System.out.println("(2) 된장찌개");
						System.out.println("(3) 삼겹살");
						System.out.println("(4) 비빔밥");
						System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)");
						int tmp2 = scan.nextInt();
						if(tmp2==1) {
							System.out.println(">> 고객님은 김치찌개를 선택하셨습니다.");
						}else if(tmp2==2) {
							System.out.println(">> 고객님은 된장찌개를 선택하셨습니다.");
						}else if(tmp2==3) {
							System.out.println(">> 고객님은 삼겹살을 선택하셨습니다.");
						}else if(tmp2==4) {
							System.out.println(">> 고객님은 비빔밥을 선택하셨습니다.");
						}else if(tmp2==0) {
							break;
						}else if(tmp2==99) {
							System.out.println("메뉴 선택이 종료되었습니다.");
							break exit_while;
						}
					}
				}	
				
				if(menu==2) {
					while(true) {
						System.out.println("[양식메뉴]");
						System.out.println("(1) 돈까스");
						System.out.println("(2) 비프스테이크");
						System.out.println("(3) 카레라이스");
						System.out.println("양식메뉴를 선택하세요.(양식메뉴선택종료:0. 전체종료:99)");
						int tmp3 = scan.nextInt();
						if(tmp3==1) {
							System.out.println(">> 고객님은 돈까스를 선택하셨습니다.");
						}else if(tmp3==2) {
							System.out.println(">> 고객님은 비프스테이크를 선택하셨습니다.");
						}else if(tmp3==3) {
							System.out.println("2>> 고객님은 카레라이스을 선택하셨습니다.");
						}else if(tmp3==0) {
							break;
						}else if(tmp3==99) {
							System.out.println("메뉴 선택이 종료되었습니다.");
							break exit_while;
						}
					}
				}	
				if(menu==3) {
					while(true) {
						System.out.println("[중식메뉴]");
						System.out.println("(1) 짜장면");
						System.out.println("(2) 짬뽕");
						System.out.println("(3) 탕수육");
						System.out.println("중식메뉴를 선택하세요.(중식메뉴선택종료:0. 전체종료:99)");
						int tmp4 = scan.nextInt();
						if(tmp4==1) {
							System.out.println(">> 고객님은 짜장면를 선택하셨습니다.");
						}else if(tmp4==2) {
							System.out.println(">> 고객님은 짬뽕를 선택하셨습니다.");
						}else if(tmp4==3) {
							System.out.println(">> 고객님은 탕수육을 선택하셨습니다.");
						}else if(tmp4==0) {
							break;
						}else if(tmp4==99) {
							System.out.println("메뉴 선택이 종료되었습니다.");
							break exit_while;
						}
					}
				}
			}
		}
	}


