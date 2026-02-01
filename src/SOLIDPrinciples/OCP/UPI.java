package SOLIDPrinciples.OCP;

public class UPI implements paymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("payment is done using UPI " + amount);
    }
}
