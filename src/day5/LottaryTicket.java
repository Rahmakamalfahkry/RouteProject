package day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LottaryTicket {
    private static final int LENGTH = 6; // Constant Field
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateTicketNumber();
        Arrays.sort(ticket);
        printTicket(ticket);
       int index = Arrays.binarySearch(ticket,10);
       if (index<0){
           System.out.println("element not found");
       }else {
           System.out.println("element is found in position "+(index+1));
       }
    }

    public static int[] generateTicketNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            } while (search(ticket, randomNumber));

            ticket[i] =  randomNumber ;
        }
        return ticket;
    }

    public static void printTicket(int[] ticket) {
        for (int number : ticket) {
            System.out.print(number + " | ");
        }
    }

    /**
     * this method search through an array sequentially
     * @param ticket array to search through
     * @param number number to search for
     * @return true if found
     */
    public static boolean search(int[] ticket, int number) {
        for (int value : ticket) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}
