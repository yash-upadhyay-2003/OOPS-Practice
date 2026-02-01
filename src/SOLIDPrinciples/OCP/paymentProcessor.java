package SOLIDPrinciples.OCP;

/** Violates OCP Principle:
 * public class PaymentProcessorBad {
 *     public void processPayment(String paymentMethod,double amount){
 *         if(paymentMethod.equals("CreditCard")){
 *             System.out.println("Credit Card Payment done" + amount);
 *         }
 *         else if(paymentMethod.equals("DebitCard")){
 *             System.out.println("Debit Card Payment done" + amount);
 *         }
 *         else if(paymentMethod.equals("Fampay")){
 *             System.out.println("Fampay Payment done" + amount);
 *         }
 *         else throw new IllegalArgumentException("Invalid payment method");
 *     }
 * }
 */
public class paymentProcessor {
    public void paymentProcessor(paymentMethod paymentMethod,double amount) {
        paymentMethod.pay(amount);
    }
}
