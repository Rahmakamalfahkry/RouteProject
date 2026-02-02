package day4;

public class Rectangle {

    // 2 fields
    protected double width;
    protected double length;
    protected int sides =4;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public Rectangle(){// default constructor
        System.out.println("I am default constructor");
        length=20;
        width=10;
        counter++;
    }
    public Rectangle(double length,double width){ // parameterized constructor
        System.out.println("I am parameterized constructor");
        setLength(length);
        setWidth(width);
        counter++;
    }

// seters
    public void setLength(double length){

        this.length=length;
    }
    public void setWidth(double width){

        this.width=width;
    }
    // geters

    public double getLength(){

        return length;
    }

    public double getWidth(){

        return width;
    }

    // 2 methods
   public double calculateArea(){
//        double area = length*width;
//        return area;
        return length*width;
    }
    public double calculatePerimeter(){
//        double perimeter = length*2+width*2;
//        return perimeter;
        return  length*2+width*2;
    }
}
