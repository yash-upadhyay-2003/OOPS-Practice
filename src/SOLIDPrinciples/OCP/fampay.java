package SOLIDPrinciples.OCP;

public class fampay implements paymentMethod{
    public void pay(double amount) {
        System.out.println("Payment is done using Debit card " + amount);
    }
}
