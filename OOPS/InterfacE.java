public interface InterfacE {
    public static void main(String[] args){ 

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UPIPayment();
        payment.pay(500);
    }
}
interface Payment{
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
