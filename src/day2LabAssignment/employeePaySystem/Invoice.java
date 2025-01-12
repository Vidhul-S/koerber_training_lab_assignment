package day2LabAssignment.employeePaySystem;

public class Invoice implements Payable {

    private int invoiceID;
    private String description;
    private double amount;
    public Invoice(int invoiceID, String description, double amount) {

        this.invoiceID = invoiceID;
        this.description = description;
        this.amount = amount;
    }
    public int getInvoiceID() {

        return this.invoiceID;
    }
    public String getDescription() {

        return this.description;
    }
    public double getAmount() {

        return this.amount;
    }
    public void getPayment() {

        System.out.println("Invoice Payment Info:");
        System.out.println("Invoice ID: " + this.invoiceID);
        System.out.println("Description: " + this.description);
        System.out.println("Amount: " + this.amount);
        System.out.println("Total Payment: " + this.amount);
    }
}
