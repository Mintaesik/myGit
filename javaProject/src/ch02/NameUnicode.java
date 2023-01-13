package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		char aValue = '\ubbfc'; //민
		char bValue = '\ud0dc'; //태
		char cValue = '\uc2dd';	//식
		
		System.out.println("char형(\'\\ubbfc\') : " + aValue) ;
		System.out.println("char형(\'\\ud0dc\') : " + bValue) ;
		System.out.println("char형(\'\\uc2dd\') : " + cValue) ;
	}
}
