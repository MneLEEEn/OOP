package pr1;
import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) { // Автоматическое закрытие
            System.out.print("Enter a string: ");
            String input = in.nextLine();

            if (isPalindrome(input)) {
                System.out.println("\"" + input + "\" is a palindrome.");
            } else {
                System.out.println("\"" + input + "\" is NOT a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        // Убираем пробелы и приводим к нижнему регистру для точности
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            // Сравниваем символы с начала и с конца
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;

	}

}
