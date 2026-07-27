package overloading;

public class MovieTicket {

	public int bookTicket(int tickets) {
		return tickets*200;
	}
	public int bookTicket(int tickets, boolean isPremium) {
		
		if(isPremium) return tickets*350;
		return tickets*200;
	}
	public int bookTicket(int tickets, boolean isPremium,int  discount) {
			int price=0;
			if(isPremium) {
				price=tickets*350;
				price=price*(100-discount)/100;
			}
			else {
				price=tickets*200;
				price=price*(100-discount)/100;
				
			}
			return price;
		}
}
