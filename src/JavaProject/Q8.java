package JavaProject;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

      //(8) Largest of Three Numbers
      //Take three numbers from the user and print the largest one.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println("first number is the largest");
        }else if (num2>num1&&num2>num3){
            System.out.println("second number is the largest");
        }else {
            System.out.println("third number is the largest");
        }

    }
}
