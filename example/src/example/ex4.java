package example;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringTokenizer exprTokenizer =
                new StringTokenizer(in.nextLine());

        while (exprTokenizer.hasMoreTokens()) {

            String expression = exprTokenizer.nextToken();

            StringTokenizer tokenizer =
                    new StringTokenizer(expression, "+-*/", true);

            try {
                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand;
                double rightOperand;

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException e) {
                    System.out.println(leftString + " is not a number");
                    continue;
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException e) {
                    System.out.println(rightString + " is not a number");
                    continue;
                }

                double result;

                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        result = leftOperand / rightOperand;
                        break;
                    default:
                        System.out.println("Unknown operator");
                        continue;
                }

                System.out.println(expression + " = " + result);

            } catch (NoSuchElementException e) {
                System.out.println("Invalid expression: " + expression);
            }
        }
    }
}