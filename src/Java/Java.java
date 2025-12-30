package Java;

import java.util.Scanner;

public class Java {
  public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        printName();

    }

    public static void printName(){
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("hello "+name);
    }
}

