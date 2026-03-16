package problem1b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Adding new book into library");

        System.out.print("Type the book title: ");
        String title = scanner.nextLine();

        System.out.print("Type the book author: ");
        String author = scanner.nextLine();

        System.out.print("Type the year of publication: ");
        int year = scanner.nextInt();

        System.out.print("Type the number of pages: ");
        int pages = scanner.nextInt();

      
        Book myBook = new Book(title, author, year, pages);

    
        System.out.println("\nObject is successfully created!");
      
        System.out.println(myBook);

        scanner.close();
    }

}
