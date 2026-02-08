package pr1;

public class task5 {

	public static void main(String[] args) {
		double initialBalance = 1000.0;
        double interestRate = 0.05; // 5% годовых

        // Рассчитываем новый баланс
        double interest = initialBalance * interestRate;
        double newBalance = initialBalance + interest;

        System.out.println("Initial Balance: " + initialBalance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("New Balance: " + newBalance);

	}

}
