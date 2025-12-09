package JavaProject;

public class Q14 {
    public static void main(String[] args) {

        //2D Array (2x3)
        //Create a 2D array (2 rows × 3 columns) and print its elements.

         int numbers [][]  ={ {1,2,3} , {4,5,6} };
        System.out.println("the elements of 2D array is ");
         for (int i =0;i<numbers.length;i++){
             for (int j=0;j<numbers[i].length;j++){
                 System.out.print(numbers[i][j] + " ");
             }
             System.out.println();
         }

    }
}


