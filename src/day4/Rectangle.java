package day4;

public class Rectangle {

    // 2 fields
    private double width;
    private double length;

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
