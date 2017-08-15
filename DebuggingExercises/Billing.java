public class Billing {

    public static void main(String[] args) {

        System.out.println(computeBill(20));
        System.out.println(computeBill(20,14));
        System.out.println(computeBill(20, 14,1.08));
    }

    public static double computeBill(double bPrice) {
        double totalDue = bPrice * 1.08;
        return totalDue;
    }

    public static double computeBill(double bPrice, int quantity){
        double totalDue = bPrice * 1.08 * quantity;
        return totalDue;
    }

    public static double computeBill(double bPrice, int quantity, double coupon){
        double totalDue = 1.08* bPrice * quantity / coupon;
        return totalDue;
    }
}