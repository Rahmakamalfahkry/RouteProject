package day3;

import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {

        int numberOfStudents = 3;
        int numberOfCourses = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<numberOfStudents;i++){
            int totalScore =0;
            for (int j=0;j<numberOfCourses;j++){
                System.out.println("Enter the score of course "+(j+1)+" for student "+(i+1));
                 int score = scanner.nextInt();
                totalScore+=score;
            }
            int average = totalScore/numberOfCourses;
            System.out.println("Total score of student "+(i+1)+" is "+average);
        }
        scanner.close();
    }
}
