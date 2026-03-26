class InvoiceProcessor {

    public void generateInvoice(String customerName, double baseAmount) {
        double finalAmount = applyTaxes(baseAmount);
        System.out.println("Standard Invoice for " + customerName + ": $" + finalAmount);
    }

    private double applyTaxes(double amount) {
        return amount * 1.15;
    }

    public void runAudit(double amount) {
        double auditedAmount = applyTaxes(amount);
        System.out.println("Internal Audit - Calculated Amount: $" + auditedAmount);
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customerName, double baseAmount) {
        double discountedAmount = baseAmount * 0.90;
        System.out.println("Retail Invoice for " + customerName + ": $" + discountedAmount);
    }

    private double applyTaxes(double amount) {
        return amount * 1.05;
    }
}

public class Q4 {
    public static void main(String[] args) {
        InvoiceProcessor standardProcessor = new InvoiceProcessor();
        standardProcessor.generateInvoice("Tech Corp", 1000.0);
        standardProcessor.runAudit(1000.0);

        System.out.println("---");

        InvoiceProcessor polyProcessor = new RetailInvoice();
        polyProcessor.generateInvoice("Alice Smith", 1000.0);
        polyProcessor.runAudit(1000.0);
    }
}