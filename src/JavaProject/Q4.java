package JavaProject;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        //(4) Sum of Two Numbers (User Input)
        //Take two numbers from the user and print their sum.

          int number1 ;
          int number2 ;
        Scanner scanner=new Scanner(System.in);
          System.out.println("enter number1");
           number1 = scanner.nextInt();
         System.out.println("enter number2");
           number2 = scanner.nextInt();
        System.out.println("the sum of the two numbers is "+(number1+number2));
    }
}
