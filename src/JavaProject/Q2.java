package JavaProject;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // (2) Write a Java program that takes text from the user and prints:Hello " HTI Group"

        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a text");
         text = scanner.nextLine();
        System.out.println("Hello \" HTI Group\""+text);
    }
}
