package Problem3;

public class CheckingAccount extends Account {
    private int transactionCounter = 0;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCounter++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCounter++;
    }

    public void deductFee() {
        if (transactionCounter > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCounter - FREE_TRANSACTIONS;
            double totalFee = extraTransactions * TRANSACTION_FEE;
            super.withdraw(totalFee);
        }
        transactionCounter = 0; 
    }

    @Override
    public String toString() {
        return super.toString() + " (Расчетный, транзакций: " + transactionCounter + ")";
    }
}
