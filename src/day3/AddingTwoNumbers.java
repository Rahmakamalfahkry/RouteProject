package day3;

import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();
            double sum = num1+num2;
            System.out.println("The sum of the two numbers is "+sum);
            System.out.println("do you want to repeat again? (true / false )");
             again = scanner.nextBoolean();
        }while (again);
        scanner.close();

    }
}
