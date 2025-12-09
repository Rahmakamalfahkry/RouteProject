package day2;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args) {
        // what we have
        int rate =15;
        int maxHoursPerWeek =40;

       // what we need

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your worked hours");
        int workedHours = scanner.nextInt();
        while (workedHours>maxHoursPerWeek){
            System.out.println("Please Enter number between 1 and 40 ");
            workedHours = scanner.nextInt();
        }
        int grossPay =workedHours*rate;
        System.out.println("your grossPay  is "+grossPay+" $");
      scanner.close();

    }
}
