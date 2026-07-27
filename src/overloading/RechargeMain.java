package overloading;

public class RechargeMain {

    public static void main(String[] args) {

        // Object using Constructor 1
        Recharge r1 = new Recharge(9876543210L);
        r1.displayRechargeDetails();
        System.out.println();

        // Object using Constructor 2
        Recharge r2 = new Recharge(9876543211L, 299);
        r2.displayRechargeDetails();
        r2.recharge();
        System.out.println();

        // Object using Constructor 3
        Recharge r3 = new Recharge(9876543212L, 499, "Jio");
        r3.displayRechargeDetails();
        r3.recharge();
        r3.recharge(56);
        r3.recharge(84, 50);
    }
}
