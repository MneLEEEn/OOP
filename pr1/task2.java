package pr1;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону квадрата a: ");
        double a = in.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println("Площадь: " + area);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Диагональ: " + diagonal);

	}

}
