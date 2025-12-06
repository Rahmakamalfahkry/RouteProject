package JavaProject;

import java.util.Scanner;

public class Q10  {
    public static void main(String[] args) {

        // (10) Swap Two Numbers
        //Take two numbers from the user ( x=2, y=3)
        //and swap them → output should be x=3, y=2.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x ");
        int x = scanner.nextInt();
        System.out.println("enter y ");
        int y = scanner.nextInt();
        int z =x;
        x = y;
        y=z;
        System.out.println("x= "+x);
        System.out.println("y= "+y);

    }
}
