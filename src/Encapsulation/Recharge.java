package Encapsulation;

public class Recharge {
	private String mobileNumber;
	private String operatorName;
	private double rechargeAmount;
	
	public void setMobileNumber(String mobileNumber) {
		if(mobileNumber.length()==10) {
			this.mobileNumber= mobileNumber;
		}
		else {
			System.out.println("Invalid Mobile Number! It should contain exactly 10 digits.");
		}
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	
    
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setRechargeAmount(double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
        
    }

    public double getRechargeAmount() {
        return rechargeAmount;
    }
	
	

}
