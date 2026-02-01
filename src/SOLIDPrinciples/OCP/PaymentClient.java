package SOLIDPrinciples.OCP;

public class PaymentClient {
    public static void main(String[] args) {
    paymentProcessor processor = new paymentProcessor();
    paymentMethod creditCard = new creditCard();
    paymentMethod upi = new UPI();
        processor.paymentProcessor(creditCard,1000);
        processor.paymentProcessor(upi,3000);
    }
}
