package InterfacePractice;

public class CashPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Cash!");
    }
}
