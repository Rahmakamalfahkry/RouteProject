package JavaProject;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        //(6) Even or Odd (User Input)
        //Take a number from the user and check if it’s even or odd

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to check");
         int number = scanner.nextInt();
         if (number%2==0){
             System.out.println("even");
         }else {
             System.out.println("odd");
         }
    }
}
