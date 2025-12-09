package JavaProject;

import java.util.ArrayList;

public class Q15 {
    public static void main(String[] args) {

        //ArrayList Example
        //• Create an ArrayList
        //• Add 4 values
        //• Remove one value
        //• Print all remaining values


        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(1);
        System.out.println("the size of array is "+numbers.size());
        for (int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

    }
}
