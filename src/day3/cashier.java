package day3;

import java.util.Scanner;

public class cashier {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter numbers of items");
        int numOfItems = scanner.nextInt();
         double total=0;
        for (int i=0;i<numOfItems;i++){
            System.out.println("Enter the cost of item "+(i+1));
             double price = scanner.nextDouble();
             total+=price;
        }
        System.out.println("The total price is "+total);
        scanner.close();

    }
}
