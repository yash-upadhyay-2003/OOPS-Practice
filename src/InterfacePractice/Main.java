package InterfacePractice;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment cash = new CashPayment();
        creditCardPayment.pay();
        cash.pay();
    }
}
