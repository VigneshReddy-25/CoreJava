package overloading;

public class MovieTicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket mt=new MovieTicket();
		System.out.println(mt.bookTicket(3));
		System.out.println(mt.bookTicket(3, false));
		System.out.println(mt.bookTicket(3, true));
		System.out.println(mt.bookTicket(3, false, 10));
		System.out.println(mt.bookTicket(3, true, 10));
	}

}
