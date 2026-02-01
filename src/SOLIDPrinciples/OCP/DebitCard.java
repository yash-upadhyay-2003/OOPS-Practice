package SOLIDPrinciples.OCP;

public class DebitCard implements paymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment is done using Debit card " + amount);
    }
}