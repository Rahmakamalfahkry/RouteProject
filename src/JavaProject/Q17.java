package JavaProject;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        // (17) Personal Info
        //Take name, age, and salary from the user and print them in one line like:
        //Name: Ali | Age: 20 | Salary: 5000

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Please enter your salary");
        int salary = scanner.nextInt();
        System.out.println("Name: "+name+" | Age: "+age+" | Salary: "+salary);




    }
}
