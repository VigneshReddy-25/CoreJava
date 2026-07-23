package Encapsulation;

public class RechargeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recharge recharge = new Recharge();

        recharge.setMobileNumber("9876543210");
        recharge.setOperatorName("Jio");
        recharge.setRechargeAmount(299);

        System.out.println("Mobile Number  : " + recharge.getMobileNumber());
        System.out.println("Operator Name  : " + recharge.getOperatorName());
        System.out.println("Recharge Amount: ₹" + recharge.getRechargeAmount());
	}

}

