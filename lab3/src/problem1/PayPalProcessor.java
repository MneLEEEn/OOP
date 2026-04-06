package problem1;

public class PayPalProcessor implements PaymentProcessor {
    private String email;
    private String status;

    public PayPalProcessor(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        this.status = "Success";
    }

    @Override
    public String getTransactionStatus() {
        return "PayPal Transaction: " + status;
    }
}

