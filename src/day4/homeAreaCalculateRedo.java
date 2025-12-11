package day4;

import java.util.Scanner;

public class homeAreaCalculateRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        homeAreaCalculateRedo calculator = new homeAreaCalculateRedo();
       Rectangle kitchen = calculator.getDimentions();
       Rectangle bathroom = calculator.getDimentions();
     calculator.scanner.close();
       double totalArea=calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("total area = "+totalArea);
    }
    public Rectangle getDimentions(){

        System.out.println("Enter room length");
         double length = scanner.nextDouble();
        System.out.println("Enter room width");
         double width = scanner.nextDouble();
         Rectangle room = new Rectangle();
         room.setLength(length);
         room.setWidth(width);
         return room;

    }
       public double calculateTotalArea(Rectangle room1,Rectangle room2){
//         double total =room1.calculateArea()+room2.calculateArea();
//         return total;
         return room1.calculateArea()+room2.calculateArea();

       }

}
