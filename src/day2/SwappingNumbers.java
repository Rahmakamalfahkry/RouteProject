package day2;

public class SwappingNumbers {
    public static void main(String[] args) {
        // using tmp
//        int a=10 ,b=20;
//        int tmp=a;
//        a=b;
//        b=tmp;
//        System.out.println(a);
//        System.out.println(b);

     // using operators
       int a=10 ,b=20;
       a= a+b;
       b= a-b;
       a= a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
