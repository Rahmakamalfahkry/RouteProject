package JavaProject;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

      //(9) Positive or Negative Check
        //Take a number from the user and check if it’s positive, negative, or zero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check");
        int number = scanner.nextInt();
        if (number>0){
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
    }
}
