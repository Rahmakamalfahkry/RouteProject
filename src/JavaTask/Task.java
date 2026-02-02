package JavaTask;
import java.util.Scanner;
public class Task {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the first integer (num1): ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer (num2): ");
            int num2 = scanner.nextInt();


            System.out.println("\n--- Arithmetic Operations ---");
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Remainder (num1 % num2): " + (num1 % num2));
            } else {
                System.out.println("Cannot calculate remainder: division by zero");
            }


            System.out.println("\n--- If Conditions ---");
            if (num1 > num2) {
                System.out.println("Greater number: num1 (" + num1 + ")");
            } else if (num2 > num1) {
                System.out.println("Greater number: num2 (" + num2 + ")");
            } else {
                System.out.println("Both numbers are equal.");
            }

            if (num1 == num2) {
                System.out.println("The numbers are equal.");
            } else {
                System.out.println("The numbers are not equal.");
            }


            System.out.println("\n--- Logical Operators ---");
            if (num1 > 0 && num2 > 0) {
                System.out.println("Both are positive");
            } else if (num1 > 0 || num2 > 0) {
                System.out.println("One is positive");
            } else {
                System.out.println("No positives");
            }


            System.out.println("\n--- Ternary Operator ---");
            int greater = (num1 > num2) ? num1 : num2;
            System.out.println("Greater number (using ternary): " + greater);

            String num1EvenOdd = (num1 % 2 == 0) ? "Even" : "Odd";
            System.out.println("num1 is " + num1EvenOdd);

            scanner.close();
        }
    }




