package Encapsulation;

public class Order {

	private int orderId;
	private String customerName;
	private double totalAmount;
	private String orderStatus;
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setTotalAmount(double totalAmount) {
		if(totalAmount>0) {
			this.totalAmount=totalAmount;
		}
		else System.out.println("Amount should be positive");
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setOrderStatus(String orderStatus) {
		if(orderStatus=="Pending" || orderStatus=="Preparing" ||  orderStatus=="Delivered" || orderStatus=="Cancelled") {
			this.orderStatus=orderStatus;
		}
		else System.out.println("Error Occured");
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	

}
