package InterfacePractice;

public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card!");
    }
}
