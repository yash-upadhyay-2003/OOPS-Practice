package SOLIDPrinciples.OCP;

public class DebitCard implements paymentMethod{
    public void pay(double amount) {
        System.out.println("Payment is done using credit card");
    }
}
