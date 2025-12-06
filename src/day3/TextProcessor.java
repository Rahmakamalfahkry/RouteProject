package day3;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text ");
        String text = scanner.nextLine();
        scanner.close();
        boolean letterFound = false;
        int position=0;
        for (int i=0;i<text.length();i++){
            char currentLetter = text.charAt(i);
            if (currentLetter=='a'||currentLetter=='A'){
                position=i+1;
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("letter A is in position "+ position);
        }else {
            System.out.println("letter A not found");
        }
    }
}
