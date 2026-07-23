package Encapsulation;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order or=new Order();
		or.setOrderId(101);
		or.setCustomerName("Vignesh");
		or.setTotalAmount(300);
		or.setOrderStatus("Preparing");
		System.out.println("Order ID  :  " + or.getOrderId());
        System.out.println("Customer Name  :  " + or.getCustomerName());
        System.out.println("Total Amount  :  ₹" + or.getTotalAmount());
        System.out.println("Order Status  :  " + or.getOrderStatus());
        
	}

}
