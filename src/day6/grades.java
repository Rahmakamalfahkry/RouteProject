package day6;

import java.util.Scanner;

public class grades {
  private static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] grades = getGrades();
        printGrades(grades);
        System.out.println();
        System.out.println("The average score is "+calculateAverage(grades));
        System.out.println("The highest score is "+getHighestGrade(grades));
        System.out.println("The lowest score is "+getLowestGrade(grades));
        scanner.close();
    }

    public static int[] getGrades() {
        int[] grades;
        System.out.println("Enter the total number of grades ");
//        int length = scanner.nextInt();
//        grades = new int[length];
        grades = new int[scanner.nextInt()];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the grade "+(i+1));
            grades[i] = scanner.nextInt();
        }
        return grades;
    }

    public static void printGrades(int[] grades) {
        for (int grade : grades) {
            System.out.print(grade+" | ");
        }
    }

    public static double calculateAverage(int[] grades) {
         double average = sum( grades)/grades.length;
        return average;
    }

    public static int sum(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static int getHighestGrade(int [] grades){
        int highestGrade = grades[0];
        for (int grade :grades){
            if(grade > highestGrade){
                highestGrade=grade;
            }
        }
        return highestGrade;
    }

    public static int getLowestGrade(int [] grades){
        int lowestGrade = grades[0];
        for (int grade :grades){
            if(grade < lowestGrade){
                lowestGrade=grade;
            }
        }
        return lowestGrade;
    }

}

