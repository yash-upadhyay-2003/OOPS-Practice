package SOLIDPrinciples.SRP;

public class Invoice {
    private double amount;

    public void Invoice(double amount) {
        this.amount = amount;
    }
    public void generateInvoice(){
        System.out.println("Invoice generated successfully." + amount);

    }