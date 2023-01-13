package ch07_2;

public interface AuctionUse {
	public static void main(String[] args) {
		Auction p1 = new Auction();
		p1.setName("홍길동");
		p1.setUserID("hong");
		p1.setMoney(150000);
		p1.print();
	} 
	
	
}
