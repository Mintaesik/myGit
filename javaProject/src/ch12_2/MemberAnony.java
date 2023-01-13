package ch12_2;

public class MemberAnony  {
	public static void main(String[] args) {
		
		Member ma = new Member() {
			int num;
			String name;
			String email;
			
			@Override
			public void info(int num, String name, String email) {
				this.num = num;
				this.name = name;
				this.email = email;
				
			}

			@Override
			public void print() {
				System.out.println("================================================");
				System.out.println("고객번호 : "+num);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
				System.out.println("================================================");
				
			}
		};
		ma.info(2, "김길동", "kim@gmail.com");
		ma.print();
	}
	
}
