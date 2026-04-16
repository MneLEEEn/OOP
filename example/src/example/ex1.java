package example;

public class ex1{
    public static void main(String[] args) {

        int numerator = 5;
        int denominator = 0;
        int ratio;

        try {
            ratio = numerator / denominator;
            System.out.println("The answer is: " + ratio);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0.");
            e.printStackTrace();
        }

        System.out.println("Done.");
    }
}