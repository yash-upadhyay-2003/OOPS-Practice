package SOLIDPrinciples.OCP;

public class creditCard implements paymentMethod {


    @Override
    public void pay(double amount) {
        System.out.println("Payment is done using credit card");
    }
}
