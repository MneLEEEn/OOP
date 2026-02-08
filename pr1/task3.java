package pr1;
import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите баллы (0-100): ");
        double score = in.nextDouble();

        if (score >= 95) System.out.println("Grade: A");
        else if (score >= 90) System.out.println("Grade: A-");
        else if (score >= 85) System.out.println("Grade: B+");
        else if (score >= 80) System.out.println("Grade: B");
        else if (score >= 75) System.out.println("Grade: B-");
        else if (score >= 70) System.out.println("Grade: C+");
        else if (score >= 65) System.out.println("Grade: C");
        else if (score >= 60) System.out.println("Grade: C-");
        else if (score >= 55) System.out.println("Grade: D+");
        else if (score >= 50) System.out.println("Grade: D");
        else System.out.println("Grade: F");

	}

}
