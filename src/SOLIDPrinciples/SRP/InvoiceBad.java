package SOLIDPrinciples.SRP;

/**
 * BAD CODE VIOLATES SRP(S)
 */
public class InvoiceBad {
    private double amount;

    public void Invoice(double amount) {
        this.amount = amount;
    }
    public void generateInvoice(){
        System.out.println("Invoice generated successfully.");

    }
    public void saveToDatabase(){
        System.out.println("Invoice saved successfully." + amount);
    }
    public void sendNotification(){
        System.out.println("Notification sent successfully." + amount);
    }
}
