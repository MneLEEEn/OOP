package lab1;
import java.util.Scanner;
public class analyzer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		data dataset = new data();
		
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String input = in.next();
			
			if (input.equals("Q")) break;
			
			try {
	            double value = Double.parseDouble(input);
	            dataset.add(value);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Invalid input. Please enter a number or 'Q'.");
	        }
		}
		
		System.out.println("Average = " + dataset.getAvg());
        System.out.println("Maximum = " + dataset.getMax());
	}
}
