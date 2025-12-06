package JavaProject;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        //(7) Largest of Two Numbers
        //Take two numbers from the user and print the largest one.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println("first number is the largest");
        }else {
            System.out.println("second number is the largest");
        }

    }
}
