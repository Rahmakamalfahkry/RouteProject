package day4;

public class homeAreaCalculator {
    public static void main(String[] args) {
    Rectangle room1 = new Rectangle();
     room1.setLength(30);
     room1.setWidth(20);
     double areaOfRoom1 = room1.calculateArea();
        System.out.println("area of room 1 = "+areaOfRoom1);
     Rectangle room2 =new Rectangle();
     room2.setLength(10);
     room2.setWidth(40);
    double  areaOfRoom2 = room2.calculateArea();
        System.out.println("area of room 2 = "+areaOfRoom2);
        double total = areaOfRoom1+areaOfRoom2;
        System.out.println("total area = "+total);

    }
}
