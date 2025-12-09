package day2;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

     // Example 1
//        int age = 18;
//        if (age>=18){
//            System.out.println("Eligible for vote");
//        }else {
//            System.out.println(" not Eligible for vote");
//        }

       //  Example 2

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to check");
//         int number=scanner.nextInt();
//         if (number%2==0){
//             System.out.println("even");
//         }else {
//             System.out.println("odd");
//         }
//       scanner.close();

        // Example 3
//
//     Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to check");
//        int number = scanner.nextInt();
//        if (number>0){
//            System.out.println("positive");
//        } else if (number<0) {
//            System.out.println("negative");
//        }else {
//            System.out.println("zero");
//        }

        // Example 4
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter second number");
//        int num2 = scanner.nextInt();
//        System.out.println("Enter third number");
//        int num3 = scanner.nextInt();
//
//        if (num1>num2&&num1>num3){
//            System.out.println("first number is the largest");
//        }else if (num2>num1&&num2>num3){
//            System.out.println("second number is the largest");
//        }else {
//            System.out.println("third number is the largest");
//        }

        // Example 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number");
         int number = scanner.nextInt();
//         if (number==1){
//             System.out.println("sunday");
//         }
//         else if (number==2){
//             System.out.println("monday");
//         }
//         else if (number==3){
//             System.out.println("tuesday");
//         }
//         else if (number==4){
//             System.out.println("wednesday");
//         }
//         else if (number==5){
//             System.out.println("thursday");
//         }
//         else if (number==6){
//             System.out.println("friday");
//         }
//         else if (number==7){
//             System.out.println("saturday");
//         }
//         else {
//             System.out.println("invalid day number");
//         }
//
        switch (number){
            case 1: System.out.println("sunday");break;
            case 2: System.out.println("monday");break;
            case 3: System.out.println("tuesday");break;
            case 4: System.out.println("wednesday");break;
            case 5: System.out.println("thursday");break;
            case 6: System.out.println("friday");break;
            case 7: System.out.println("saturday");break;
            default: System.out.println("invalid day number");

        }


      scanner.close();


    }
}
