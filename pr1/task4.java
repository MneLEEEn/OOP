package pr1;
import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        // Считаем дискриминант один раз
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Ошибка: Дискриминант отрицательный, вещественных корней нет.");
        } else {
            // Считаем корень из D один раз, чтобы сэкономить время
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            if (discriminant == 0) {
                System.out.println("Уравнение имеет один корень: " + x1);
            } else {
                System.out.println("Корень x1: " + x1);
                System.out.println("Корень x2: " + x2);
            }
        }

	}

}
