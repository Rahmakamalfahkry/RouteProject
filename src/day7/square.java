package day7;

import day4.Rectangle;

public class square extends Rectangle {
    @Override
    public double calculatePerimeter(){
        double perimeter = length*sides;
        return perimeter;
    }
}
