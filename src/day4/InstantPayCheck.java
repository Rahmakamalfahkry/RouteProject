package day4;

import java.util.Scanner;

public class InstantPayCheck {
    //what we have
     static final double requiredSalary =20000;
    static final double requiredCreditScore =700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getUserSalary();
        double creditScore = getUserCreditScore();
        boolean qualified =isQualified(salary,creditScore);
        scanner.close();
        notifyUser(qualified);

    }

   static double getUserSalary(){
       System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
   }
   static double getUserCreditScore(){
       System.out.println("Enter your creditScore");
       double creditScore = scanner.nextDouble();
       return creditScore;
   }

     static boolean isQualified(double salary,double creditScore){
         if (salary>requiredSalary&&creditScore>requiredCreditScore){
            return true;
         }else{
             return false;
         }
     }
     static void notifyUser(boolean qualified){
        if (qualified){
            System.out.println("congratulations , you are qualified");
        }else {
            System.out.println("sorry , you are not qualified");
        }
     }

}
