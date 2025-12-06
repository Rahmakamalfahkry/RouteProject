package JavaProject;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // (16) Switch Case – Day of Week
        //Take a number (1–7) from the user and print the day of the week using switch case.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number");
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 1: System.out.println("sunday");break;
            case 2: System.out.println("monday");break;
            case 3: System.out.println("tuesday");break;
            case 4: System.out.println("wednesday");break;
            case 5: System.out.println("thursday");break;
            case 6: System.out.println("friday");break;
            case 7: System.out.println("saturday");break;
            default: System.out.println("invalid number");
        }
         scanner.close();
    }
}
