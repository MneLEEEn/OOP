package problem1;

public class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;
    private String cardholderName;
    private String status;

    public CreditCardProcessor(String cardNumber, String cardholderName) {
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
    }

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of $" + amount);
        this.status = "Completed";
		
	}

	@Override
	public String getTransactionStatus() {
		return "Credit Card Transaction: " + status;
	}
}